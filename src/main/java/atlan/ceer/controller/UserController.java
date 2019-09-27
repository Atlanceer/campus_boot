package atlan.ceer.controller;

import atlan.ceer.config.MyLogger;
import atlan.ceer.enumeration.MyStatus;
import atlan.ceer.model.*;
import atlan.ceer.pojo.User;
import atlan.ceer.service.UserService;
import atlan.ceer.util.CodeUtil;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import atlan.ceer.util.TokenUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private TokenUtil tokenUtil;
    @Autowired
    private UserService userService;
    @Autowired
    private CodeUtil codeUtil;

    @RequestMapping("/getMessage")
    public MyResult sendMessage(@RequestBody String body, HttpServletResponse response, HttpServletRequest request){
        //得到请求体
        JSONObject jsonObject=new JSONObject(body);
        String phone=jsonObject.getString("phone");
        //判断手机号是否存在
        /*if (userService.isPhoneContain(phone)){
            return new MyResult(false,MyStatus.PHONE_EXIST.getMessage(),MyStatus.PHONE_EXIST.getCode());
        }*/
        String auth=request.getHeader("auth");
        //判断请求是否合法
        StringBuilder toMD5=new StringBuilder(phone.substring(7));
        toMD5.append("a");
        if (!auth.equals(DigestUtils.md5DigestAsHex(toMD5.toString().getBytes()))){
            return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
        }

        try {
            //发送短信
            //String code=messageUtil.sendRegisterMessage(phone);
            String code="000000";
            if (code==null){
                return new MyResult(false,MyStatus.MESSAGE_ERROR.getMessage(),MyStatus.MESSAGE_ERROR.getCode());
            }
            String codeToken=tokenUtil.createTokenForMessage(code,phone);
            response.setHeader("codeToken",codeToken);
            return new MyResult(true, MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
        } catch (Exception e) {
            e.printStackTrace();
            //myResult.setStatus(false);
            return new MyResult(false,MyStatus.ERROR.getMessage(),MyStatus.ERROR.getCode());
        }
    }

    @RequestMapping("/register")
    public MyResult register(@RequestBody Register register, HttpServletRequest request, HttpServletResponse response){
        User user=new User();
        user.setPhone(register.getPhone());
        user.setPassword(register.getPassword());
        String codeToken=request.getHeader("codeToken");
        //验证码验证
        //token验证
        if (tokenUtil.verifyToken(codeToken)){
            //验证码是否匹配
            if (register.getAuthCode().equals(tokenUtil.parseTokenForMessage(codeToken))){
                //匹配就添加用户 返回token
                String token=userService.addUser(user);
                if (token!=null){
                    response.setHeader("token",token);
                    UserInfSimple userInfSimple=new UserInfSimple();
                    userInfSimple.setIdUser(user.getIdUser());
                    return new MyResult(userInfSimple,true,MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
                }else {
                    return new MyResult(false,MyStatus.DATABASE_ERROR.getMessage(),MyStatus.DATABASE_ERROR.getCode());
                }
            }else {
                return new MyResult(false,MyStatus.CODE_WRONG.getMessage(),MyStatus.CODE_WRONG.getCode());
            }
        }else {
            return new MyResult(false,MyStatus.CODE_OUTOF_TIME.getMessage(),MyStatus.CODE_OUTOF_TIME.getCode());
        }
    }

    //包含登录 注册
    @RequestMapping("/login")
    public MyResult login(@RequestBody Login login, HttpServletResponse response, HttpServletRequest request){
        //user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));

        MyLogger.logger.info(login.toString());
        //判断手机号是否存在
        if (userService.isPhoneContain(login.getPhone())){
            String token=null;
            //密码为空就是验证码登录
            if (login.getPassword()==null){
                //验证码登录
                String authCode=login.getAuthCode();
                String codeToken=request.getHeader("codeToken");
                //验证验证码
                if (tokenUtil.verifyToken(codeToken)){
                    //MyLogger.logger.info(tokenUtil.parseTokenForMessage(codeToken).toString());
                    if (authCode.equals(tokenUtil.parseTokenForMessage(codeToken).get("code").toString())){
                        token=userService.login(login);
                    }
                }else {
                    return new MyResult(false,MyStatus.CODE_OUTOF_TIME.getMessage(),MyStatus.CODE_OUTOF_TIME.getCode());
                }
            }else {//密码登录
                token=userService.login(login);
                if (token==null){
                    return new MyResult(false,MyStatus.LOGIN_PASSWORD_WRONG.getMessage(),MyStatus.LOGIN_PASSWORD_WRONG.getCode());
                }
            }
            if (token!=null){
                response.setHeader("token",token);

                //添加用户简易信息
                UserInfSimple userInfSimple=new UserInfSimple();
                userInfSimple.setIdUser((String) tokenUtil.parseTokenForLogin(token).get("id"));
                return new MyResult(userInfSimple,true,MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
            }else {
                return new MyResult(true,MyStatus.CODE_WRONG.getMessage(),MyStatus.CODE_WRONG.getCode());
            }
        }else {
            //手机号不存在就是注册
            //验证码登录
            String authCode=login.getAuthCode();
            String codeToken=request.getHeader("codeToken");
            //验证验证码
            if (tokenUtil.verifyToken(codeToken)){
                if (authCode.equals(tokenUtil.parseTokenForMessage(codeToken).get("code").toString())) {
                    User user = new User();
                    user.setPhone(login.getPhone());
                    //随机生成密码
                    user.setPassword(codeUtil.getCode());
                    String token = userService.addUser(user);
                    if (token != null) {
                        response.setHeader("token", token);

                        //添加用户简易信息
                        UserInfSimple userInfSimple=new UserInfSimple();
                        userInfSimple.setIdUser((String) tokenUtil.parseTokenForLogin(token).get("id"));
                        return new MyResult(userInfSimple,true, MyStatus.REGISTER_SUCCESS.getMessage(), MyStatus.REGISTER_SUCCESS.getCode());
                    } else {
                        return new MyResult(false, MyStatus.DATABASE_ERROR.getMessage(), MyStatus.DATABASE_ERROR.getCode());
                    }
                }else {
                    return new MyResult(true,MyStatus.CODE_WRONG.getMessage(),MyStatus.CODE_WRONG.getCode());
                }
            }else {
                return new MyResult(true,MyStatus.CODE_OUTOF_TIME.getMessage(),MyStatus.CODE_OUTOF_TIME.getCode());
            }
        }
    }

    @RequestMapping("/userInfAll")
    public MyResult queryUserInfAll(@RequestBody String body){
        try {
            JSONObject jsonObject=new JSONObject(body);
            String userId="";
            if (jsonObject.has("idUser")) {
                userId = jsonObject.getString("idUser");
            }else if (jsonObject.has("id")){
                userId = jsonObject.getString("id");
            }else {
                return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
            }
            UserInfAll userInfAll=userService.queryUserInfAll(userId);
            return new MyResult(userInfAll, true, MyStatus.SUCCESS.getMessage(), MyStatus.SUCCESS.getCode());
        } catch (JSONException e) {
            e.printStackTrace();
            return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
        }
    }

    @RequestMapping(value = "/checkLoginStatus", method = RequestMethod.GET)
    public MyResult checkLoginStatus(HttpServletRequest request){
        try {
            String token=request.getHeader("token");
            if (!tokenUtil.verifyToken(token)){
                return new MyResult(false,MyStatus.LOGIN_NO.getMessage(),MyStatus.LOGIN_NO.getCode());
            }
            Map map=tokenUtil.parseTokenForLogin(token);
            String userId= (String) map.get("id");
            if (userService.checkLoginStatus(userId,token)){

                //添加用户简易信息
                UserInfSimple userInfSimple=new UserInfSimple();
                userInfSimple.setIdUser((String) tokenUtil.parseTokenForLogin(token).get("id"));
                return new MyResult(userInfSimple,true,MyStatus.LOGIN_YES.getMessage(),MyStatus.LOGIN_YES.getCode());
            }else {
                return new MyResult(false,MyStatus.LOGIN_NO.getMessage(),MyStatus.LOGIN_NO.getCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
        }
    }

    @RequestMapping("/forgot")
    public MyResult forgotPassword(@RequestBody String body,HttpServletResponse response,HttpServletRequest request){
        JSONObject jsonObject=new JSONObject(body);
        String phone=jsonObject.getString("phone");
        String password=jsonObject.getString("password");
        String authCode=jsonObject.getString("authCode");
        String codeToken=request.getHeader("codeToken");
        //判断手机号存不存在
        if (!userService.isPhoneContain(phone)){
            return new MyResult(false,MyStatus.PHONE_NOT_EXIST.getMessage(),MyStatus.PHONE_NOT_EXIST.getCode());
        }
        //token验证
        if (tokenUtil.verifyToken(codeToken)){
            //验证码是否匹配
            if (authCode.equals(tokenUtil.parseTokenForMessage(codeToken).get("code").toString())){
                //匹配
                if (userService.forgot(phone,password)){
                    return new MyResult(true,MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
                }else {
                    return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
                }
            }else {
                return new MyResult(false,MyStatus.CODE_WRONG.getMessage(),MyStatus.CODE_WRONG.getCode());
            }
        }else {
            return new MyResult(false,MyStatus.CODE_OUTOF_TIME.getMessage(),MyStatus.CODE_WRONG.getCode());
        }
    }

    @RequestMapping("update")
    public MyResult updateUser(@RequestBody UserUpdate userUpdate,HttpServletRequest request,HttpServletResponse response){
        String token=request.getHeader("token");
        Map map=tokenUtil.parseTokenForLogin(token);
        String userId= (String) map.get("id");
        //判断是否修改手机号
        if (userUpdate.getPhone()!=null){
            MyLogger.logger.info("修改手机号"+userUpdate.getPhone());
            if (userService.isPhoneContain(userUpdate.getPhone())){
                return new MyResult(false,MyStatus.PHONE_EXIST.getMessage(),MyStatus.PHONE_EXIST.getCode());
            }else {
                MyLogger.logger.info("手机号不存在");
                //判断是否携带验证码
                if (userUpdate.getAuthCode()!=null){
                    MyLogger.logger.info("携带验证码"+userUpdate.getAuthCode());
                    try {
                        //检查头部是否携带codeToken
                        String codeToken=request.getHeader("codeToken");
                        //验证验证码是否过期（前面：判断是否伪造，后面判断验证码是否匹配）
                        if (!tokenUtil.verifyTokenForMessage(codeToken, userUpdate.getPhone(), userUpdate.getAuthCode())){
                            return new MyResult(false,MyStatus.CODE_OUTOF_TIME.getMessage(),MyStatus.CODE_OUTOF_TIME.getCode());
                        }
                        //后面判断验证码是否匹配
                        if(!tokenUtil.parseTokenForMessage(codeToken).get("code").toString().equals(userUpdate.getAuthCode())) {
                            return new MyResult(false,MyStatus.CODE_OUTOF_TIME.getMessage(),MyStatus.CODE_OUTOF_TIME.getCode());
                        }//如果都满足判断就继续运行
                        MyLogger.logger.info("没有过期");
                    } catch (Exception e) {
                        e.printStackTrace();
                        return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
                    }
                }else {
                    return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
                }
            }
        }
        //依据用户id进行修改
        userUpdate.setIdUser(userId);
        String result=userService.updateUser(userUpdate);
        if (result.equals("error")){
            return new MyResult(false,MyStatus.DATABASE_ERROR.getMessage(),MyStatus.DATABASE_ERROR.getCode());
        }else if (result.equals("success")){
            return new MyResult(true,MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
        }else {
            //响应token
            response.setHeader("token",result);
            return new MyResult(true,MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
        }
    }

    @RequestMapping("/verifyPhone")
    public MyResult verifyPhone(@RequestBody String body, HttpServletRequest request){
        try {
            JSONObject jsonObject=new JSONObject(body);
            String phone=jsonObject.getString("phone");
            String authCode=jsonObject.getString("authCode");
            String codeToken=request.getHeader("codeToken");
            if (tokenUtil.verifyTokenForMessage(codeToken,phone,authCode)){
                if (tokenUtil.parseTokenForMessage(codeToken).get("code").toString().equals(authCode)){
                    return new MyResult(true,MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
                }else {
                    return new MyResult(false,MyStatus.CODE_WRONG.getMessage(),MyStatus.CODE_WRONG.getCode());
                }
            }else {
                return new MyResult(false,MyStatus.CODE_OUTOF_TIME.getMessage(),MyStatus.CODE_OUTOF_TIME.getCode());
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
        }
    }
}
