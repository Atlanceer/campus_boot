package atlan.ceer.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfExample() {
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

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsIsNull() {
            addCriterion("collect_goods is null");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsIsNotNull() {
            addCriterion("collect_goods is not null");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsEqualTo(Integer value) {
            addCriterion("collect_goods =", value, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsNotEqualTo(Integer value) {
            addCriterion("collect_goods <>", value, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsGreaterThan(Integer value) {
            addCriterion("collect_goods >", value, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_goods >=", value, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsLessThan(Integer value) {
            addCriterion("collect_goods <", value, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("collect_goods <=", value, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsIn(List<Integer> values) {
            addCriterion("collect_goods in", values, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsNotIn(List<Integer> values) {
            addCriterion("collect_goods not in", values, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsBetween(Integer value1, Integer value2) {
            addCriterion("collect_goods between", value1, value2, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_goods not between", value1, value2, "collectGoods");
            return (Criteria) this;
        }

        public Criteria andCollectPostIsNull() {
            addCriterion("collect_post is null");
            return (Criteria) this;
        }

        public Criteria andCollectPostIsNotNull() {
            addCriterion("collect_post is not null");
            return (Criteria) this;
        }

        public Criteria andCollectPostEqualTo(Integer value) {
            addCriterion("collect_post =", value, "collectPost");
            return (Criteria) this;
        }

        public Criteria andCollectPostNotEqualTo(Integer value) {
            addCriterion("collect_post <>", value, "collectPost");
            return (Criteria) this;
        }

        public Criteria andCollectPostGreaterThan(Integer value) {
            addCriterion("collect_post >", value, "collectPost");
            return (Criteria) this;
        }

        public Criteria andCollectPostGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_post >=", value, "collectPost");
            return (Criteria) this;
        }

        public Criteria andCollectPostLessThan(Integer value) {
            addCriterion("collect_post <", value, "collectPost");
            return (Criteria) this;
        }

        public Criteria andCollectPostLessThanOrEqualTo(Integer value) {
            addCriterion("collect_post <=", value, "collectPost");
            return (Criteria) this;
        }

        public Criteria andCollectPostIn(List<Integer> values) {
            addCriterion("collect_post in", values, "collectPost");
            return (Criteria) this;
        }

        public Criteria andCollectPostNotIn(List<Integer> values) {
            addCriterion("collect_post not in", values, "collectPost");
            return (Criteria) this;
        }

        public Criteria andCollectPostBetween(Integer value1, Integer value2) {
            addCriterion("collect_post between", value1, value2, "collectPost");
            return (Criteria) this;
        }

        public Criteria andCollectPostNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_post not between", value1, value2, "collectPost");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIsNull() {
            addCriterion("count_goods is null");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIsNotNull() {
            addCriterion("count_goods is not null");
            return (Criteria) this;
        }

        public Criteria andCountGoodsEqualTo(Integer value) {
            addCriterion("count_goods =", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsNotEqualTo(Integer value) {
            addCriterion("count_goods <>", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsGreaterThan(Integer value) {
            addCriterion("count_goods >", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_goods >=", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsLessThan(Integer value) {
            addCriterion("count_goods <", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("count_goods <=", value, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIn(List<Integer> values) {
            addCriterion("count_goods in", values, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsNotIn(List<Integer> values) {
            addCriterion("count_goods not in", values, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsBetween(Integer value1, Integer value2) {
            addCriterion("count_goods between", value1, value2, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("count_goods not between", value1, value2, "countGoods");
            return (Criteria) this;
        }

        public Criteria andCountNeedsIsNull() {
            addCriterion("count_needs is null");
            return (Criteria) this;
        }

        public Criteria andCountNeedsIsNotNull() {
            addCriterion("count_needs is not null");
            return (Criteria) this;
        }

        public Criteria andCountNeedsEqualTo(Integer value) {
            addCriterion("count_needs =", value, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountNeedsNotEqualTo(Integer value) {
            addCriterion("count_needs <>", value, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountNeedsGreaterThan(Integer value) {
            addCriterion("count_needs >", value, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountNeedsGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_needs >=", value, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountNeedsLessThan(Integer value) {
            addCriterion("count_needs <", value, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountNeedsLessThanOrEqualTo(Integer value) {
            addCriterion("count_needs <=", value, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountNeedsIn(List<Integer> values) {
            addCriterion("count_needs in", values, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountNeedsNotIn(List<Integer> values) {
            addCriterion("count_needs not in", values, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountNeedsBetween(Integer value1, Integer value2) {
            addCriterion("count_needs between", value1, value2, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountNeedsNotBetween(Integer value1, Integer value2) {
            addCriterion("count_needs not between", value1, value2, "countNeeds");
            return (Criteria) this;
        }

        public Criteria andCountLikeIsNull() {
            addCriterion("count_like is null");
            return (Criteria) this;
        }

        public Criteria andCountLikeIsNotNull() {
            addCriterion("count_like is not null");
            return (Criteria) this;
        }

        public Criteria andCountLikeEqualTo(Integer value) {
            addCriterion("count_like =", value, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountLikeNotEqualTo(Integer value) {
            addCriterion("count_like <>", value, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountLikeGreaterThan(Integer value) {
            addCriterion("count_like >", value, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_like >=", value, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountLikeLessThan(Integer value) {
            addCriterion("count_like <", value, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountLikeLessThanOrEqualTo(Integer value) {
            addCriterion("count_like <=", value, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountLikeIn(List<Integer> values) {
            addCriterion("count_like in", values, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountLikeNotIn(List<Integer> values) {
            addCriterion("count_like not in", values, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountLikeBetween(Integer value1, Integer value2) {
            addCriterion("count_like between", value1, value2, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("count_like not between", value1, value2, "countLike");
            return (Criteria) this;
        }

        public Criteria andCountPostIsNull() {
            addCriterion("count_post is null");
            return (Criteria) this;
        }

        public Criteria andCountPostIsNotNull() {
            addCriterion("count_post is not null");
            return (Criteria) this;
        }

        public Criteria andCountPostEqualTo(Integer value) {
            addCriterion("count_post =", value, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountPostNotEqualTo(Integer value) {
            addCriterion("count_post <>", value, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountPostGreaterThan(Integer value) {
            addCriterion("count_post >", value, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountPostGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_post >=", value, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountPostLessThan(Integer value) {
            addCriterion("count_post <", value, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountPostLessThanOrEqualTo(Integer value) {
            addCriterion("count_post <=", value, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountPostIn(List<Integer> values) {
            addCriterion("count_post in", values, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountPostNotIn(List<Integer> values) {
            addCriterion("count_post not in", values, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountPostBetween(Integer value1, Integer value2) {
            addCriterion("count_post between", value1, value2, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountPostNotBetween(Integer value1, Integer value2) {
            addCriterion("count_post not between", value1, value2, "countPost");
            return (Criteria) this;
        }

        public Criteria andCountFollowIsNull() {
            addCriterion("count_follow is null");
            return (Criteria) this;
        }

        public Criteria andCountFollowIsNotNull() {
            addCriterion("count_follow is not null");
            return (Criteria) this;
        }

        public Criteria andCountFollowEqualTo(Integer value) {
            addCriterion("count_follow =", value, "countFollow");
            return (Criteria) this;
        }

        public Criteria andCountFollowNotEqualTo(Integer value) {
            addCriterion("count_follow <>", value, "countFollow");
            return (Criteria) this;
        }

        public Criteria andCountFollowGreaterThan(Integer value) {
            addCriterion("count_follow >", value, "countFollow");
            return (Criteria) this;
        }

        public Criteria andCountFollowGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_follow >=", value, "countFollow");
            return (Criteria) this;
        }

        public Criteria andCountFollowLessThan(Integer value) {
            addCriterion("count_follow <", value, "countFollow");
            return (Criteria) this;
        }

        public Criteria andCountFollowLessThanOrEqualTo(Integer value) {
            addCriterion("count_follow <=", value, "countFollow");
            return (Criteria) this;
        }

        public Criteria andCountFollowIn(List<Integer> values) {
            addCriterion("count_follow in", values, "countFollow");
            return (Criteria) this;
        }

        public Criteria andCountFollowNotIn(List<Integer> values) {
            addCriterion("count_follow not in", values, "countFollow");
            return (Criteria) this;
        }

        public Criteria andCountFollowBetween(Integer value1, Integer value2) {
            addCriterion("count_follow between", value1, value2, "countFollow");
            return (Criteria) this;
        }

        public Criteria andCountFollowNotBetween(Integer value1, Integer value2) {
            addCriterion("count_follow not between", value1, value2, "countFollow");
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

        public Criteria andCountFansIsNull() {
            addCriterion("count_fans is null");
            return (Criteria) this;
        }

        public Criteria andCountFansIsNotNull() {
            addCriterion("count_fans is not null");
            return (Criteria) this;
        }

        public Criteria andCountFansEqualTo(Integer value) {
            addCriterion("count_fans =", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansNotEqualTo(Integer value) {
            addCriterion("count_fans <>", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansGreaterThan(Integer value) {
            addCriterion("count_fans >", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_fans >=", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansLessThan(Integer value) {
            addCriterion("count_fans <", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansLessThanOrEqualTo(Integer value) {
            addCriterion("count_fans <=", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansIn(List<Integer> values) {
            addCriterion("count_fans in", values, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansNotIn(List<Integer> values) {
            addCriterion("count_fans not in", values, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansBetween(Integer value1, Integer value2) {
            addCriterion("count_fans between", value1, value2, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansNotBetween(Integer value1, Integer value2) {
            addCriterion("count_fans not between", value1, value2, "countFans");
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