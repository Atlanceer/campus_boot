package atlan.ceer.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NeedsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NeedsExample() {
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

        public Criteria andIdNeedsIsNull() {
            addCriterion("id_needs is null");
            return (Criteria) this;
        }

        public Criteria andIdNeedsIsNotNull() {
            addCriterion("id_needs is not null");
            return (Criteria) this;
        }

        public Criteria andIdNeedsEqualTo(String value) {
            addCriterion("id_needs =", value, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsNotEqualTo(String value) {
            addCriterion("id_needs <>", value, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsGreaterThan(String value) {
            addCriterion("id_needs >", value, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsGreaterThanOrEqualTo(String value) {
            addCriterion("id_needs >=", value, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsLessThan(String value) {
            addCriterion("id_needs <", value, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsLessThanOrEqualTo(String value) {
            addCriterion("id_needs <=", value, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsLike(String value) {
            addCriterion("id_needs like", value, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsNotLike(String value) {
            addCriterion("id_needs not like", value, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsIn(List<String> values) {
            addCriterion("id_needs in", values, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsNotIn(List<String> values) {
            addCriterion("id_needs not in", values, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsBetween(String value1, String value2) {
            addCriterion("id_needs between", value1, value2, "idNeeds");
            return (Criteria) this;
        }

        public Criteria andIdNeedsNotBetween(String value1, String value2) {
            addCriterion("id_needs not between", value1, value2, "idNeeds");
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

        public Criteria andNeedsCategoryIsNull() {
            addCriterion("needs_category is null");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryIsNotNull() {
            addCriterion("needs_category is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryEqualTo(String value) {
            addCriterion("needs_category =", value, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryNotEqualTo(String value) {
            addCriterion("needs_category <>", value, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryGreaterThan(String value) {
            addCriterion("needs_category >", value, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("needs_category >=", value, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryLessThan(String value) {
            addCriterion("needs_category <", value, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryLessThanOrEqualTo(String value) {
            addCriterion("needs_category <=", value, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryLike(String value) {
            addCriterion("needs_category like", value, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryNotLike(String value) {
            addCriterion("needs_category not like", value, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryIn(List<String> values) {
            addCriterion("needs_category in", values, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryNotIn(List<String> values) {
            addCriterion("needs_category not in", values, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryBetween(String value1, String value2) {
            addCriterion("needs_category between", value1, value2, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsCategoryNotBetween(String value1, String value2) {
            addCriterion("needs_category not between", value1, value2, "needsCategory");
            return (Criteria) this;
        }

        public Criteria andNeedsNameIsNull() {
            addCriterion("needs_name is null");
            return (Criteria) this;
        }

        public Criteria andNeedsNameIsNotNull() {
            addCriterion("needs_name is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsNameEqualTo(String value) {
            addCriterion("needs_name =", value, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameNotEqualTo(String value) {
            addCriterion("needs_name <>", value, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameGreaterThan(String value) {
            addCriterion("needs_name >", value, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameGreaterThanOrEqualTo(String value) {
            addCriterion("needs_name >=", value, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameLessThan(String value) {
            addCriterion("needs_name <", value, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameLessThanOrEqualTo(String value) {
            addCriterion("needs_name <=", value, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameLike(String value) {
            addCriterion("needs_name like", value, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameNotLike(String value) {
            addCriterion("needs_name not like", value, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameIn(List<String> values) {
            addCriterion("needs_name in", values, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameNotIn(List<String> values) {
            addCriterion("needs_name not in", values, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameBetween(String value1, String value2) {
            addCriterion("needs_name between", value1, value2, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsNameNotBetween(String value1, String value2) {
            addCriterion("needs_name not between", value1, value2, "needsName");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceIsNull() {
            addCriterion("needs_price is null");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceIsNotNull() {
            addCriterion("needs_price is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceEqualTo(BigDecimal value) {
            addCriterion("needs_price =", value, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceNotEqualTo(BigDecimal value) {
            addCriterion("needs_price <>", value, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceGreaterThan(BigDecimal value) {
            addCriterion("needs_price >", value, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("needs_price >=", value, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceLessThan(BigDecimal value) {
            addCriterion("needs_price <", value, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("needs_price <=", value, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceIn(List<BigDecimal> values) {
            addCriterion("needs_price in", values, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceNotIn(List<BigDecimal> values) {
            addCriterion("needs_price not in", values, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("needs_price between", value1, value2, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("needs_price not between", value1, value2, "needsPrice");
            return (Criteria) this;
        }

        public Criteria andNeedsTipIsNull() {
            addCriterion("needs_tip is null");
            return (Criteria) this;
        }

        public Criteria andNeedsTipIsNotNull() {
            addCriterion("needs_tip is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsTipEqualTo(BigDecimal value) {
            addCriterion("needs_tip =", value, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsTipNotEqualTo(BigDecimal value) {
            addCriterion("needs_tip <>", value, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsTipGreaterThan(BigDecimal value) {
            addCriterion("needs_tip >", value, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsTipGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("needs_tip >=", value, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsTipLessThan(BigDecimal value) {
            addCriterion("needs_tip <", value, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsTipLessThanOrEqualTo(BigDecimal value) {
            addCriterion("needs_tip <=", value, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsTipIn(List<BigDecimal> values) {
            addCriterion("needs_tip in", values, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsTipNotIn(List<BigDecimal> values) {
            addCriterion("needs_tip not in", values, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsTipBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("needs_tip between", value1, value2, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsTipNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("needs_tip not between", value1, value2, "needsTip");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationIsNull() {
            addCriterion("needs_location is null");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationIsNotNull() {
            addCriterion("needs_location is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationEqualTo(String value) {
            addCriterion("needs_location =", value, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationNotEqualTo(String value) {
            addCriterion("needs_location <>", value, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationGreaterThan(String value) {
            addCriterion("needs_location >", value, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationGreaterThanOrEqualTo(String value) {
            addCriterion("needs_location >=", value, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationLessThan(String value) {
            addCriterion("needs_location <", value, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationLessThanOrEqualTo(String value) {
            addCriterion("needs_location <=", value, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationLike(String value) {
            addCriterion("needs_location like", value, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationNotLike(String value) {
            addCriterion("needs_location not like", value, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationIn(List<String> values) {
            addCriterion("needs_location in", values, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationNotIn(List<String> values) {
            addCriterion("needs_location not in", values, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationBetween(String value1, String value2) {
            addCriterion("needs_location between", value1, value2, "needsLocation");
            return (Criteria) this;
        }

        public Criteria andNeedsLocationNotBetween(String value1, String value2) {
            addCriterion("needs_location not between", value1, value2, "needsLocation");
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