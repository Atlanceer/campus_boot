package atlan.ceer.model;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class GoodsInfAll {
    /*@Value("${headPath}")
    private String headPath;*/

    private String idGoods;

    private String idUser;

    private String goodsName;

    private String userName;

//    private StringBuilder avatar=new StringBuilder("http://47.240.50.254:8081");
    private StringBuilder avatar=new StringBuilder("http://pxrb7a13c.bkt.clouddn.com/");

    private BigDecimal goodsPrice;

    private Integer isNew;

    private String goodsLocation;

    private String goodsCategory;

    private String goodsImages;

    private List images;

    private String mainImage;

    private String goodsDes;

    private String address;

    private Integer collected;

    private Integer browsed;

    private Integer status;

    private String tag;

    private Integer lever;

    private Date gmtCreate;

    private Date gmtModified;

    private String goodsInf;

    public String getIdGoods() {
        return idGoods;
    }

    public void setIdGoods(String idGoods) {
        this.idGoods = idGoods;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public String getGoodsLocation() {
        return goodsLocation;
    }

    public void setGoodsLocation(String goodsLocation) {
        this.goodsLocation = goodsLocation;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public String getGoodsImages() {
        return goodsImages;
    }

    public void setGoodsImages(String goodsImages) {
        this.goodsImages = goodsImages;
    }

    public List getImages() {
        return images;
    }

    public void setImages(List images) {
        this.images = images;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getGoodsDes() {
        return goodsDes;
    }

    public void setGoodsDes(String goodsDes) {
        this.goodsDes = goodsDes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getLever() {
        return lever;
    }

    public void setLever(Integer lever) {
        this.lever = lever;
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

    public String getGoodsInf() {
        return goodsInf;
    }

    public void setGoodsInf(String goodsInf) {
        this.goodsInf = goodsInf;
    }

    @Override
    public String toString() {
        return "GoodsInfAll{" +
                "idGoods='" + idGoods + '\'' +
                ", idUser='" + idUser + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", userName='" + userName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", isNew=" + isNew +
                ", goodsLocation='" + goodsLocation + '\'' +
                ", goodsCategory='" + goodsCategory + '\'' +
                ", goodsImages='" + goodsImages + '\'' +
                ", mainImage='" + mainImage + '\'' +
                ", goodsDes='" + goodsDes + '\'' +
                ", address='" + address + '\'' +
                ", collected=" + collected +
                ", browsed=" + browsed +
                ", status=" + status +
                ", tag='" + tag + '\'' +
                ", lever=" + lever +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", goodsInf='" + goodsInf + '\'' +
                '}';
    }
}
