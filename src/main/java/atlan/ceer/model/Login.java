package atlan.ceer.model;

public class Login {
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
        return "login{" +
                "phone='" + phone + '\'' +
                ", authCode='" + authCode + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
