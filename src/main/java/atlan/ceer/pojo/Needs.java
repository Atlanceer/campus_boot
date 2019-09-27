package atlan.ceer.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Needs {
    private Integer id;

    private String idNeeds;

    private String idUser;

    private String needsCategory;

    private String needsName;

    private BigDecimal needsPrice;

    private BigDecimal needsTip;

    private String needsLocation;

    private Integer collected;

    private Integer browsed;

    private Integer lever;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModified;

    private String needsInf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdNeeds() {
        return idNeeds;
    }

    public void setIdNeeds(String idNeeds) {
        this.idNeeds = idNeeds == null ? null : idNeeds.trim();
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser == null ? null : idUser.trim();
    }

    public String getNeedsCategory() {
        return needsCategory;
    }

    public void setNeedsCategory(String needsCategory) {
        this.needsCategory = needsCategory == null ? null : needsCategory.trim();
    }

    public String getNeedsName() {
        return needsName;
    }

    public void setNeedsName(String needsName) {
        this.needsName = needsName == null ? null : needsName.trim();
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
        this.needsLocation = needsLocation == null ? null : needsLocation.trim();
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

    public String getNeedsInf() {
        return needsInf;
    }

    public void setNeedsInf(String needsInf) {
        this.needsInf = needsInf == null ? null : needsInf.trim();
    }
}