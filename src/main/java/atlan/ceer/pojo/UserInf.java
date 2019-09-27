package atlan.ceer.pojo;

import java.util.Date;

public class UserInf {
    private Integer id;

    private String idUser;

    private String avatar;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser == null ? null : idUser.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
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
        this.location = location == null ? null : location.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
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
        this.record = record == null ? null : record.trim();
    }
}