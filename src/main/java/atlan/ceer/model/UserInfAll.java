package atlan.ceer.model;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class UserInfAll {
    /*@Value("${headPath}")
    private static String headPath;*/

    private String idUser;

    //香港服务器
//    private StringBuilder avatar=new StringBuilder("http://47.240.50.254:8081");
    private StringBuilder avatar=new StringBuilder("http://pxrb7a13c.bkt.clouddn.com/");

    private String userName;

    private String phone;

    private String email;

    private String studentNum;

    private String signature;

    private Integer collectGoods;

    private Integer collectPost;

    private String location;

    private String school;

    private String birthday;

    private String sex;

    private Integer countGoods;

    private Integer countNeeds;

    private Integer countLike;

    private Integer countPost;

    private Integer countFollow;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer countFans;

    private String record;

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getAvatar() {
        return avatar.toString();
    }

    public void setAvatar(String avatar) {
        this.avatar.append(avatar);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getCollectGoods() {
        return collectGoods;
    }

    public void setCollectGoods(Integer collectGoods) {
        this.collectGoods = collectGoods;
    }

    public Integer getCollectPost() {
        return collectPost;
    }

    public void setCollectPost(Integer collectPost) {
        this.collectPost = collectPost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getCountGoods() {
        return countGoods;
    }

    public void setCountGoods(Integer countGoods) {
        this.countGoods = countGoods;
    }

    public Integer getCountNeeds() {
        return countNeeds;
    }

    public void setCountNeeds(Integer countNeeds) {
        this.countNeeds = countNeeds;
    }

    public Integer getCountLike() {
        return countLike;
    }

    public void setCountLike(Integer countLike) {
        this.countLike = countLike;
    }

    public Integer getCountPost() {
        return countPost;
    }

    public void setCountPost(Integer countPost) {
        this.countPost = countPost;
    }

    public Integer getCountFollow() {
        return countFollow;
    }

    public void setCountFollow(Integer countFollow) {
        this.countFollow = countFollow;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getCountFans() {
        return countFans;
    }

    public void setCountFans(Integer countFans) {
        this.countFans = countFans;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "UserInfAll{" +
                "idUser='" + idUser + '\'' +
                ", avatar=" + avatar +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", studentNum='" + studentNum + '\'' +
                ", signature='" + signature + '\'' +
                ", collectGoods=" + collectGoods +
                ", collectPost=" + collectPost +
                ", location='" + location + '\'' +
                ", school='" + school + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", countGoods=" + countGoods +
                ", countNeeds=" + countNeeds +
                ", countLike=" + countLike +
                ", countPost=" + countPost +
                ", countFollow=" + countFollow +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", countFans=" + countFans +
                ", record='" + record + '\'' +
                '}';
    }
}
