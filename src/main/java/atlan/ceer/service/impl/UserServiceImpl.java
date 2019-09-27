package atlan.ceer.service.impl;

import atlan.ceer.config.MyLogger;
import atlan.ceer.mapper.MyMapper;
import atlan.ceer.mapper.QueryMapper;
import atlan.ceer.mapper.UserInfMapper;
import atlan.ceer.mapper.UserMapper;
import atlan.ceer.model.Login;
import atlan.ceer.model.UserInfAll;
import atlan.ceer.model.UserUpdate;
import atlan.ceer.pojo.User;
import atlan.ceer.pojo.UserExample;
import atlan.ceer.pojo.UserInf;
import atlan.ceer.service.UserService;
import atlan.ceer.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.DigestUtils;
import atlan.ceer.util.CodeUtil;
import atlan.ceer.util.TokenUtil;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Value("${defaultAvatarPath}")
    private String avatar;
    @Value("${headPath}")
    private String headPath;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TokenUtil tokenUtil;
    @Autowired
    private CodeUtil codeUtil;
    @Autowired
    private QueryMapper queryMapper;
    @Autowired
    private UserInfMapper userInfMapper;
    @Autowired
    private TimeUtil timeUtil;
    @Autowired
    private MyMapper myMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String addUser(User user) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andPhoneEqualTo(user.getPhone());
        List<User> users=userMapper.selectByExample(userExample);
        //手机号不存在
        if (users.isEmpty()){
            user.setUserName(codeUtil.getUserName());
            user.setIdUser(codeUtil.getCode());
            try {
                //密码加密
                user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
                //生成token并且将token存入数据库
                String token=tokenUtil.createTokenForLogin(user.getUserName(),user.getIdUser());
                user.setToken(token);
                //插入时间
                Date nowDate=timeUtil.getTime();
                user.setGmtCreate(nowDate);
                user.setGmtModified(nowDate);
                userMapper.insertSelective(user);

                //同时在userinf表中添加记录
                UserInf userInf=new UserInf();
                userInf.setIdUser(user.getIdUser());
                //默认头像
                userInf.setAvatar(avatar);
                //插入时间
                userInf.setGmtCreate(nowDate);
                userInf.setGmtModified(nowDate);
                userInfMapper.insertSelective(userInf);
                return token;
            } catch (Exception e) {
                MyLogger.logger.error("数据库错误");
                //事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                e.printStackTrace();
                return null;
            }
        }else {
            MyLogger.logger.info("手机号不存在");
            return null;
        }
    }

    @Override
    public String login(Login login) {
        UserExample userExample=new UserExample();
        //判断什么方式登录 (还未添加)
        UserExample.Criteria criteria=userExample.createCriteria();
        //如果携带密码就是使用密码登录
        if (login.getPhone()!=null&&login.getPassword()!=null){
            criteria.andPhoneEqualTo(login.getPhone());
            criteria.andPasswordEqualTo(login.getPassword());
            if (userMapper.countByExample(userExample)!=1){
                MyLogger.logger.info("密码错误");
                return null;
            }
        }
        //否则就是验证码登录
        /*if (login.getPassword()==null){
            criteria.andPhoneEqualTo(login.getPhone());
        }*/
        //取出用户名和id 存入token
        userExample.clear();
        UserExample.Criteria criteria1=userExample.createCriteria();
        criteria1.andPhoneEqualTo(login.getPhone());
        List<User> users=userMapper.selectByExample(userExample);
        //token里面存有用户的id和用户名
        String token=tokenUtil.createTokenForLogin(users.get(0).getUserName(),users.get(0).getIdUser());
        User addToken=new User();
        addToken.setToken(token);
        userMapper.updateByExampleSelective(addToken, userExample);
        return token;
    }

    /**
     * 修改密码
     * @return
     */
    @Transactional
    @Override
    public String updateUser(UserUpdate userUpdate) {
        try {
            //设置修改时间
            userUpdate.setModified(timeUtil.getTime());

            //如果包含avatar和studentNum就更新user_inf表
            if (userUpdate.getAvatar()!=null||userUpdate.getStudentNum()!=null){
                myMapper.updateUserInf(userUpdate);
            }

            //如果手机号 用户名 密码不为空就修改user表
            if (userUpdate.getUserName()!=null||userUpdate.getPassword()!=null||userUpdate.getPhone()!=null){
                myMapper.updateUser(userUpdate);
                //如果修改了用户名就更新token
                if (userUpdate.getUserName()!=null){
                    //更新token
                    String token=tokenUtil.createTokenForLogin(userUpdate.getUserName(), userUpdate.getIdUser());
                    User addToken=new User();
                    addToken.setToken(token);
                    UserExample userExample=new UserExample();
                    UserExample.Criteria criteria=userExample.createCriteria();
                    criteria.andIdUserEqualTo(userUpdate.getIdUser());
                    userMapper.updateByExampleSelective(addToken, userExample);
                    return token;
                }
            }
            return "success";

        } catch (Exception e) {
            e.printStackTrace();
            //事务回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return "error";
        }
    }

    @Override
    public boolean isPhoneContain(String phone) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andPhoneEqualTo(phone);
        List<User> users=userMapper.selectByExample(userExample);
        //手机号不存在返回false
        if (users.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public UserInfAll queryUserInfAll(String userId) {
        try {
            UserInfAll userInfAll=queryMapper.queryUserInfAll(userId);
            //userInfAll.setAvatar(avatar);
            /*if (userInfAll.getAvatar().equals(headPath)){
            }*/
            return userInfAll;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean checkLoginStatus(String userId, String token) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdUserEqualTo(userId);
        criteria.andTokenEqualTo(token);
        //查询用户token是否过期或者伪造登录
        long count=userMapper.countByExample(userExample);
        System.out.println(count+"===="+userId+"===="+token);
        return !(count==0);
    }

    @Override
    public boolean forgot(String phone, String password) {
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria=userExample.createCriteria();
            criteria.andPhoneEqualTo(phone);
            User user=new User();
            user.setPassword(password);
            userMapper.updateByExampleSelective(user, userExample);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
