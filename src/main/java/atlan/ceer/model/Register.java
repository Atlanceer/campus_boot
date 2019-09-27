package atlan.ceer.model;

/**
 * 注册时的模型
 */
public class Register {
    private String phone;

    private String authCode;

    private String password;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Register{" +
                "phone='" + phone + '\'' +
                ", authCode='" + authCode + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
