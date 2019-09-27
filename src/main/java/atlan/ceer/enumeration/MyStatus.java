package atlan.ceer.enumeration;

public enum MyStatus {
    SUCCESS(200, "成功")
    ,ERROR(201, "错误")
    ,NOT_ALLOWED_REQUEST(205, "非法请求")
    ,PHONE_EXIST(201, "手机号存在")
    ,PHONE_NOT_EXIST(202, "手机号不存在")
    ,MESSAGE_ERROR(206, "手机号格式错误")
    ,MESSAGE_SUCCESS(200,"短信发送成功")
    ,CODE_WRONG(202, "验证码错误")
    ,CODE_OUTOF_TIME(204, "验证码失效或错误")
    ,LOGIN_PASSWORD_WRONG(201, "登录失败密码错误")
    ,DATABASE_ERROR(205,"数据库错误")
    ,LOGIN_YES(200,"验证登录成功")
    ,LOGIN_NO(201,"请重新登录")
    ,REGISTER_SUCCESS(200, "注册成功");

    private int code;
    private String message;

    private MyStatus(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
