package atlan.ceer.model;

import java.util.Date;

/**
 * 用于更新用户
 */
public class UserUpdate {
    private String idUser;

    private String userName;

    private String avatar;

    private String studentNum;

    private String password;

    private String phone;

    private Date modified;

    private String authCode;

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "UserUpdate{" +
                "idUser='" + idUser + '\'' +
                ", userName='" + userName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", studentNum='" + studentNum + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", modified=" + modified +
                ", authCode='" + authCode + '\'' +
                '}';
    }
}
