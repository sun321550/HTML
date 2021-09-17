package bean;

import java.util.ArrayList;
import java.util.List;

public class TDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TDetailExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andBdidIsNull() {
            addCriterion("bdId is null");
            return (Criteria) this;
        }

        public Criteria andBdidIsNotNull() {
            addCriterion("bdId is not null");
            return (Criteria) this;
        }

        public Criteria andBdidEqualTo(Integer value) {
            addCriterion("bdId =", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotEqualTo(Integer value) {
            addCriterion("bdId <>", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThan(Integer value) {
            addCriterion("bdId >", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdId >=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThan(Integer value) {
            addCriterion("bdId <", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThanOrEqualTo(Integer value) {
            addCriterion("bdId <=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidIn(List<Integer> values) {
            addCriterion("bdId in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotIn(List<Integer> values) {
            addCriterion("bdId not in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidBetween(Integer value1, Integer value2) {
            addCriterion("bdId between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotBetween(Integer value1, Integer value2) {
            addCriterion("bdId not between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bId is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bId is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bId =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bId <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bId >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bId >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bId <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bId <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bId in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bId not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bId between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bId not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBdnameIsNull() {
            addCriterion("bdName is null");
            return (Criteria) this;
        }

        public Criteria andBdnameIsNotNull() {
            addCriterion("bdName is not null");
            return (Criteria) this;
        }

        public Criteria andBdnameEqualTo(String value) {
            addCriterion("bdName =", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotEqualTo(String value) {
            addCriterion("bdName <>", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameGreaterThan(String value) {
            addCriterion("bdName >", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameGreaterThanOrEqualTo(String value) {
            addCriterion("bdName >=", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLessThan(String value) {
            addCriterion("bdName <", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLessThanOrEqualTo(String value) {
            addCriterion("bdName <=", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLike(String value) {
            addCriterion("bdName like", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotLike(String value) {
            addCriterion("bdName not like", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameIn(List<String> values) {
            addCriterion("bdName in", values, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotIn(List<String> values) {
            addCriterion("bdName not in", values, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameBetween(String value1, String value2) {
            addCriterion("bdName between", value1, value2, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotBetween(String value1, String value2) {
            addCriterion("bdName not between", value1, value2, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdpersonIsNull() {
            addCriterion("bdPerson is null");
            return (Criteria) this;
        }

        public Criteria andBdpersonIsNotNull() {
            addCriterion("bdPerson is not null");
            return (Criteria) this;
        }

        public Criteria andBdpersonEqualTo(String value) {
            addCriterion("bdPerson =", value, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonNotEqualTo(String value) {
            addCriterion("bdPerson <>", value, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonGreaterThan(String value) {
            addCriterion("bdPerson >", value, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonGreaterThanOrEqualTo(String value) {
            addCriterion("bdPerson >=", value, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonLessThan(String value) {
            addCriterion("bdPerson <", value, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonLessThanOrEqualTo(String value) {
            addCriterion("bdPerson <=", value, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonLike(String value) {
            addCriterion("bdPerson like", value, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonNotLike(String value) {
            addCriterion("bdPerson not like", value, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonIn(List<String> values) {
            addCriterion("bdPerson in", values, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonNotIn(List<String> values) {
            addCriterion("bdPerson not in", values, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonBetween(String value1, String value2) {
            addCriterion("bdPerson between", value1, value2, "bdperson");
            return (Criteria) this;
        }

        public Criteria andBdpersonNotBetween(String value1, String value2) {
            addCriterion("bdPerson not between", value1, value2, "bdperson");
            return (Criteria) this;
        }
    }

    /**
     */
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