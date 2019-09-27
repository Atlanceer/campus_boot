package atlan.ceer.model;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品简易信息模型
 */
public class SimpleGoods {
    /*@Value("${headPath}")
    private String headPath;*/
    private String idUser;
    private String idGoods;
    private String userName;
    private String goodsName;
    //香港服务器
//    private StringBuilder avatar=new StringBuilder("http://47.240.50.254:8081");
    private StringBuilder avatar=new StringBuilder("http://pxrb7a13c.bkt.clouddn.com/");
    private BigDecimal goodsPrice;
    private Integer isNew;
    //香港服务器
//    private StringBuilder mainImage=new StringBuilder("http://47.240.50.254:8081");
    private StringBuilder mainImage=new StringBuilder("http://pxrb7a13c.bkt.clouddn.com/");
    private Integer collected;
    private Integer browsed;
    private String goodsLocation;
    private String tag;
    private Date gmtCreate;
    private Date gmtModified;


    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdGoods() {
        return idGoods;
    }

    public void setIdGoods(String idGoods) {
        this.idGoods = idGoods;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getAvatar() {
        return avatar.toString();
    }

    public void setAvatar(String avatar) {
        this.avatar.append(avatar);
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public String getMainImage() {
        return mainImage.toString();
    }

    public void setMainImage(String mainImage) {
        this.mainImage.append(mainImage);
        this.mainImage.append("?imageMogr2/auto-orient/thumbnail/1600x900>/format/jpg/blur/1x0/quality/100%7Cimageslim");
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

    public String getGoodsLocation() {
        return goodsLocation;
    }

    public void setGoodsLocation(String goodsLocation) {
        this.goodsLocation = goodsLocation;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
        return "SimpleGoods{" +
                ", idUser='" + idUser + '\'' +
                ", idGoods='" + idGoods + '\'' +
                ", userName='" + userName + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", avatar=" + avatar +
                ", goodsPrice=" + goodsPrice +
                ", isNew=" + isNew +
                ", mainImage=" + mainImage +
                ", collected=" + collected +
                ", browsed=" + browsed +
                ", goodsLocation='" + goodsLocation + '\'' +
                ", tag='" + tag + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
