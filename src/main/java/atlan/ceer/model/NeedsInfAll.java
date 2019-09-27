package atlan.ceer.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 需求模板
 */
public class NeedsInfAll {
    /*@Value("${headPath}")
    private String headPath;*/

    private String idNeeds;

    private String idUser;

    private String userName;

//    private StringBuilder avatar=new StringBuilder("http://47.240.50.254:8081");
    private StringBuilder avatar=new StringBuilder("http://pxrb7a13c.bkt.clouddn.com/");

    private String needsCategory;

    private String needsName;

    private String needsInf;

    private BigDecimal needsPrice;

    private BigDecimal needsTip;

    private String needsLocation;

    private Integer collected;

    private Integer browsed;

    private Integer lever;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModified;

    public String getIdNeeds() {
        return idNeeds;
    }

    public void setIdNeeds(String idNeeds) {
        this.idNeeds = idNeeds;
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
        return avatar.toString();
    }

    public void setAvatar(String avatar) {
        this.avatar.append(avatar);
    }

    public String getNeedsCategory() {
        return needsCategory;
    }

    public void setNeedsCategory(String needsCategory) {
        this.needsCategory = needsCategory;
    }

    public String getNeedsName() {
        return needsName;
    }

    public void setNeedsName(String needsName) {
        this.needsName = needsName;
    }

    public String getNeedsInf() {
        return needsInf;
    }

    public void setNeedsInf(String needsInf) {
        this.needsInf = needsInf;
    }

    public BigDecimal getNeedsPrice() {
        return needsPrice;
    }

    public void setNeedsPrice(BigDecimal needsPrice) {
        this.needsPrice = needsPrice;
    }

    public BigDecimal getNeedsTip() {
        return needsTip;
    }

    public void setNeedsTip(BigDecimal needsTip) {
        this.needsTip = needsTip;
    }

    public String getNeedsLocation() {
        return needsLocation;
    }

    public void setNeedsLocation(String needsLocation) {
        this.needsLocation = needsLocation;
    }

    public Integer getCollected() {
        return collected;
    }

    public void setCollected(Integer collected) {
        this.collected = collected;
    }

    public Integer getBrowsed() {
        return browsed;
    }

    public void setBrowsed(Integer browsed) {
        this.browsed = browsed;
    }

    public Integer getLever() {
        return lever;
    }

    public void setLever(Integer lever) {
        this.lever = lever;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "NeedsInfAll{" +
                "idNeeds='" + idNeeds + '\'' +
                ", idUser='" + idUser + '\'' +
                ", userName='" + userName + '\'' +
                ", avatar=" + avatar +
                ", needsCategory='" + needsCategory + '\'' +
                ", needsName='" + needsName + '\'' +
                ", needsInf='" + needsInf + '\'' +
                ", needsPrice=" + needsPrice +
                ", needsTip=" + needsTip +
                ", needsLocation='" + needsLocation + '\'' +
                ", collected=" + collected +
                ", browsed=" + browsed +
                ", lever=" + lever +
                ", status=" + status +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
