package atlan.ceer.service;

import atlan.ceer.model.Login;
import atlan.ceer.model.UserInfAll;
import atlan.ceer.model.UserUpdate;
import atlan.ceer.pojo.User;

public interface UserService {
    String addUser(User user);//添加成功返回token 否则null
    String login(Login login);//登录成功更新token
    String updateUser(UserUpdate userUpdate);
    boolean isPhoneContain(String phone);
    UserInfAll queryUserInfAll(String userid);
    boolean checkLoginStatus(String userid, String token);
    boolean forgot(String phone, String password);
}
