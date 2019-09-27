package atlan.ceer.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdGoodsIsNull() {
            addCriterion("id_goods is null");
            return (Criteria) this;
        }

        public Criteria andIdGoodsIsNotNull() {
            addCriterion("id_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIdGoodsEqualTo(String value) {
            addCriterion("id_goods =", value, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsNotEqualTo(String value) {
            addCriterion("id_goods <>", value, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsGreaterThan(String value) {
            addCriterion("id_goods >", value, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("id_goods >=", value, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsLessThan(String value) {
            addCriterion("id_goods <", value, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsLessThanOrEqualTo(String value) {
            addCriterion("id_goods <=", value, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsLike(String value) {
            addCriterion("id_goods like", value, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsNotLike(String value) {
            addCriterion("id_goods not like", value, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsIn(List<String> values) {
            addCriterion("id_goods in", values, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsNotIn(List<String> values) {
            addCriterion("id_goods not in", values, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsBetween(String value1, String value2) {
            addCriterion("id_goods between", value1, value2, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdGoodsNotBetween(String value1, String value2) {
            addCriterion("id_goods not between", value1, value2, "idGoods");
            return (Criteria) this;
        }

        public Criteria andIdUserIsNull() {
            addCriterion("id_user is null");
            return (Criteria) this;
        }

        public Criteria andIdUserIsNotNull() {
            addCriterion("id_user is not null");
            return (Criteria) this;
        }

        public Criteria andIdUserEqualTo(String value) {
            addCriterion("id_user =", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotEqualTo(String value) {
            addCriterion("id_user <>", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserGreaterThan(String value) {
            addCriterion("id_user >", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserGreaterThanOrEqualTo(String value) {
            addCriterion("id_user >=", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserLessThan(String value) {
            addCriterion("id_user <", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserLessThanOrEqualTo(String value) {
            addCriterion("id_user <=", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserLike(String value) {
            addCriterion("id_user like", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotLike(String value) {
            addCriterion("id_user not like", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserIn(List<String> values) {
            addCriterion("id_user in", values, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotIn(List<String> values) {
            addCriterion("id_user not in", values, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserBetween(String value1, String value2) {
            addCriterion("id_user between", value1, value2, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotBetween(String value1, String value2) {
            addCriterion("id_user not between", value1, value2, "idUser");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Integer value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Integer value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Integer value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Integer value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Integer value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Integer> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Integer> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Integer value1, Integer value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Integer value1, Integer value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationIsNull() {
            addCriterion("goods_location is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationIsNotNull() {
            addCriterion("goods_location is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationEqualTo(String value) {
            addCriterion("goods_location =", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationNotEqualTo(String value) {
            addCriterion("goods_location <>", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationGreaterThan(String value) {
            addCriterion("goods_location >", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationGreaterThanOrEqualTo(String value) {
            addCriterion("goods_location >=", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationLessThan(String value) {
            addCriterion("goods_location <", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationLessThanOrEqualTo(String value) {
            addCriterion("goods_location <=", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationLike(String value) {
            addCriterion("goods_location like", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationNotLike(String value) {
            addCriterion("goods_location not like", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationIn(List<String> values) {
            addCriterion("goods_location in", values, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationNotIn(List<String> values) {
            addCriterion("goods_location not in", values, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationBetween(String value1, String value2) {
            addCriterion("goods_location between", value1, value2, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationNotBetween(String value1, String value2) {
            addCriterion("goods_location not between", value1, value2, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIsNull() {
            addCriterion("goods_category is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIsNotNull() {
            addCriterion("goods_category is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryEqualTo(String value) {
            addCriterion("goods_category =", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotEqualTo(String value) {
            addCriterion("goods_category <>", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryGreaterThan(String value) {
            addCriterion("goods_category >", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("goods_category >=", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLessThan(String value) {
            addCriterion("goods_category <", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLessThanOrEqualTo(String value) {
            addCriterion("goods_category <=", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLike(String value) {
            addCriterion("goods_category like", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotLike(String value) {
            addCriterion("goods_category not like", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIn(List<String> values) {
            addCriterion("goods_category in", values, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotIn(List<String> values) {
            addCriterion("goods_category not in", values, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryBetween(String value1, String value2) {
            addCriterion("goods_category between", value1, value2, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotBetween(String value1, String value2) {
            addCriterion("goods_category not between", value1, value2, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesIsNull() {
            addCriterion("goods_images is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesIsNotNull() {
            addCriterion("goods_images is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesEqualTo(String value) {
            addCriterion("goods_images =", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesNotEqualTo(String value) {
            addCriterion("goods_images <>", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesGreaterThan(String value) {
            addCriterion("goods_images >", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesGreaterThanOrEqualTo(String value) {
            addCriterion("goods_images >=", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesLessThan(String value) {
            addCriterion("goods_images <", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesLessThanOrEqualTo(String value) {
            addCriterion("goods_images <=", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesLike(String value) {
            addCriterion("goods_images like", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesNotLike(String value) {
            addCriterion("goods_images not like", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesIn(List<String> values) {
            addCriterion("goods_images in", values, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesNotIn(List<String> values) {
            addCriterion("goods_images not in", values, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesBetween(String value1, String value2) {
            addCriterion("goods_images between", value1, value2, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesNotBetween(String value1, String value2) {
            addCriterion("goods_images not between", value1, value2, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andMainImageIsNull() {
            addCriterion("main_image is null");
            return (Criteria) this;
        }

        public Criteria andMainImageIsNotNull() {
            addCriterion("main_image is not null");
            return (Criteria) this;
        }

        public Criteria andMainImageEqualTo(String value) {
            addCriterion("main_image =", value, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageNotEqualTo(String value) {
            addCriterion("main_image <>", value, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageGreaterThan(String value) {
            addCriterion("main_image >", value, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageGreaterThanOrEqualTo(String value) {
            addCriterion("main_image >=", value, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageLessThan(String value) {
            addCriterion("main_image <", value, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageLessThanOrEqualTo(String value) {
            addCriterion("main_image <=", value, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageLike(String value) {
            addCriterion("main_image like", value, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageNotLike(String value) {
            addCriterion("main_image not like", value, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageIn(List<String> values) {
            addCriterion("main_image in", values, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageNotIn(List<String> values) {
            addCriterion("main_image not in", values, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageBetween(String value1, String value2) {
            addCriterion("main_image between", value1, value2, "mainImage");
            return (Criteria) this;
        }

        public Criteria andMainImageNotBetween(String value1, String value2) {
            addCriterion("main_image not between", value1, value2, "mainImage");
            return (Criteria) this;
        }

        public Criteria andGoodsDesIsNull() {
            addCriterion("goods_des is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDesIsNotNull() {
            addCriterion("goods_des is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDesEqualTo(String value) {
            addCriterion("goods_des =", value, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesNotEqualTo(String value) {
            addCriterion("goods_des <>", value, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesGreaterThan(String value) {
            addCriterion("goods_des >", value, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesGreaterThanOrEqualTo(String value) {
            addCriterion("goods_des >=", value, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesLessThan(String value) {
            addCriterion("goods_des <", value, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesLessThanOrEqualTo(String value) {
            addCriterion("goods_des <=", value, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesLike(String value) {
            addCriterion("goods_des like", value, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesNotLike(String value) {
            addCriterion("goods_des not like", value, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesIn(List<String> values) {
            addCriterion("goods_des in", values, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesNotIn(List<String> values) {
            addCriterion("goods_des not in", values, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesBetween(String value1, String value2) {
            addCriterion("goods_des between", value1, value2, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andGoodsDesNotBetween(String value1, String value2) {
            addCriterion("goods_des not between", value1, value2, "goodsDes");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCollectedIsNull() {
            addCriterion("collected is null");
            return (Criteria) this;
        }

        public Criteria andCollectedIsNotNull() {
            addCriterion("collected is not null");
            return (Criteria) this;
        }

        public Criteria andCollectedEqualTo(Integer value) {
            addCriterion("collected =", value, "collected");
            return (Criteria) this;
        }

        public Criteria andCollectedNotEqualTo(Integer value) {
            addCriterion("collected <>", value, "collected");
            return (Criteria) this;
        }

        public Criteria andCollectedGreaterThan(Integer value) {
            addCriterion("collected >", value, "collected");
            return (Criteria) this;
        }

        public Criteria andCollectedGreaterThanOrEqualTo(Integer value) {
            addCriterion("collected >=", value, "collected");
            return (Criteria) this;
        }

        public Criteria andCollectedLessThan(Integer value) {
            addCriterion("collected <", value, "collected");
            return (Criteria) this;
        }

        public Criteria andCollectedLessThanOrEqualTo(Integer value) {
            addCriterion("collected <=", value, "collected");
            return (Criteria) this;
        }

        public Criteria andCollectedIn(List<Integer> values) {
            addCriterion("collected in", values, "collected");
            return (Criteria) this;
        }

        public Criteria andCollectedNotIn(List<Integer> values) {
            addCriterion("collected not in", values, "collected");
            return (Criteria) this;
        }

        public Criteria andCollectedBetween(Integer value1, Integer value2) {
            addCriterion("collected between", value1, value2, "collected");
            return (Criteria) this;
        }

        public Criteria andCollectedNotBetween(Integer value1, Integer value2) {
            addCriterion("collected not between", value1, value2, "collected");
            return (Criteria) this;
        }

        public Criteria andBrowsedIsNull() {
            addCriterion("browsed is null");
            return (Criteria) this;
        }

        public Criteria andBrowsedIsNotNull() {
            addCriterion("browsed is not null");
            return (Criteria) this;
        }

        public Criteria andBrowsedEqualTo(Integer value) {
            addCriterion("browsed =", value, "browsed");
            return (Criteria) this;
        }

        public Criteria andBrowsedNotEqualTo(Integer value) {
            addCriterion("browsed <>", value, "browsed");
            return (Criteria) this;
        }

        public Criteria andBrowsedGreaterThan(Integer value) {
            addCriterion("browsed >", value, "browsed");
            return (Criteria) this;
        }

        public Criteria andBrowsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("browsed >=", value, "browsed");
            return (Criteria) this;
        }

        public Criteria andBrowsedLessThan(Integer value) {
            addCriterion("browsed <", value, "browsed");
            return (Criteria) this;
        }

        public Criteria andBrowsedLessThanOrEqualTo(Integer value) {
            addCriterion("browsed <=", value, "browsed");
            return (Criteria) this;
        }

        public Criteria andBrowsedIn(List<Integer> values) {
            addCriterion("browsed in", values, "browsed");
            return (Criteria) this;
        }

        public Criteria andBrowsedNotIn(List<Integer> values) {
            addCriterion("browsed not in", values, "browsed");
            return (Criteria) this;
        }

        public Criteria andBrowsedBetween(Integer value1, Integer value2) {
            addCriterion("browsed between", value1, value2, "browsed");
            return (Criteria) this;
        }

        public Criteria andBrowsedNotBetween(Integer value1, Integer value2) {
            addCriterion("browsed not between", value1, value2, "browsed");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andLeverIsNull() {
            addCriterion("lever is null");
            return (Criteria) this;
        }

        public Criteria andLeverIsNotNull() {
            addCriterion("lever is not null");
            return (Criteria) this;
        }

        public Criteria andLeverEqualTo(Integer value) {
            addCriterion("lever =", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverNotEqualTo(Integer value) {
            addCriterion("lever <>", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverGreaterThan(Integer value) {
            addCriterion("lever >", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverGreaterThanOrEqualTo(Integer value) {
            addCriterion("lever >=", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverLessThan(Integer value) {
            addCriterion("lever <", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverLessThanOrEqualTo(Integer value) {
            addCriterion("lever <=", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverIn(List<Integer> values) {
            addCriterion("lever in", values, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverNotIn(List<Integer> values) {
            addCriterion("lever not in", values, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverBetween(Integer value1, Integer value2) {
            addCriterion("lever between", value1, value2, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverNotBetween(Integer value1, Integer value2) {
            addCriterion("lever not between", value1, value2, "lever");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}