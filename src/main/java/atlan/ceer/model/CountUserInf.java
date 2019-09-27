package atlan.ceer.model;

public class CountUserInf {

    private String idUser;
    private Integer collectGoods;
    private Integer collectPost;
    private Integer countGoods;
    private Integer countNeeds;
    private Integer countLike;
    private Integer countPost;
    private Integer countFollow;
    private Integer countFans;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public Integer getCountFans() {
        return countFans;
    }

    public void setCountFans(Integer countFans) {
        this.countFans = countFans;
    }

    @Override
    public String toString() {
        return "CountUserInf{" +
                "idUser='" + idUser + '\'' +
                ", collectGoods=" + collectGoods +
                ", collectPost=" + collectPost +
                ", countGoods=" + countGoods +
                ", countNeeds=" + countNeeds +
                ", countLike=" + countLike +
                ", countPost=" + countPost +
                ", countFollow=" + countFollow +
                ", countFans=" + countFans +
                '}';
    }
}
