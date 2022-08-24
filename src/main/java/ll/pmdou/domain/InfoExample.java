package ll.pmdou.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(Integer value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(Integer value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(Integer value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(Integer value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<Integer> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<Integer> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(Integer value1, Integer value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIPhoneIsNull() {
            addCriterion("i_phone is null");
            return (Criteria) this;
        }

        public Criteria andIPhoneIsNotNull() {
            addCriterion("i_phone is not null");
            return (Criteria) this;
        }

        public Criteria andIPhoneEqualTo(String value) {
            addCriterion("i_phone =", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneNotEqualTo(String value) {
            addCriterion("i_phone <>", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneGreaterThan(String value) {
            addCriterion("i_phone >", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("i_phone >=", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneLessThan(String value) {
            addCriterion("i_phone <", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneLessThanOrEqualTo(String value) {
            addCriterion("i_phone <=", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneLike(String value) {
            addCriterion("i_phone like", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneNotLike(String value) {
            addCriterion("i_phone not like", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneIn(List<String> values) {
            addCriterion("i_phone in", values, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneNotIn(List<String> values) {
            addCriterion("i_phone not in", values, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneBetween(String value1, String value2) {
            addCriterion("i_phone between", value1, value2, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneNotBetween(String value1, String value2) {
            addCriterion("i_phone not between", value1, value2, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIEidIsNull() {
            addCriterion("i_eid is null");
            return (Criteria) this;
        }

        public Criteria andIEidIsNotNull() {
            addCriterion("i_eid is not null");
            return (Criteria) this;
        }

        public Criteria andIEidEqualTo(Integer value) {
            addCriterion("i_eid =", value, "iEid");
            return (Criteria) this;
        }

        public Criteria andIEidNotEqualTo(Integer value) {
            addCriterion("i_eid <>", value, "iEid");
            return (Criteria) this;
        }

        public Criteria andIEidGreaterThan(Integer value) {
            addCriterion("i_eid >", value, "iEid");
            return (Criteria) this;
        }

        public Criteria andIEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_eid >=", value, "iEid");
            return (Criteria) this;
        }

        public Criteria andIEidLessThan(Integer value) {
            addCriterion("i_eid <", value, "iEid");
            return (Criteria) this;
        }

        public Criteria andIEidLessThanOrEqualTo(Integer value) {
            addCriterion("i_eid <=", value, "iEid");
            return (Criteria) this;
        }

        public Criteria andIEidIn(List<Integer> values) {
            addCriterion("i_eid in", values, "iEid");
            return (Criteria) this;
        }

        public Criteria andIEidNotIn(List<Integer> values) {
            addCriterion("i_eid not in", values, "iEid");
            return (Criteria) this;
        }

        public Criteria andIEidBetween(Integer value1, Integer value2) {
            addCriterion("i_eid between", value1, value2, "iEid");
            return (Criteria) this;
        }

        public Criteria andIEidNotBetween(Integer value1, Integer value2) {
            addCriterion("i_eid not between", value1, value2, "iEid");
            return (Criteria) this;
        }

        public Criteria andIUptimeIsNull() {
            addCriterion("i_uptime is null");
            return (Criteria) this;
        }

        public Criteria andIUptimeIsNotNull() {
            addCriterion("i_uptime is not null");
            return (Criteria) this;
        }

        public Criteria andIUptimeEqualTo(Date value) {
            addCriterion("i_uptime =", value, "iUptime");
            return (Criteria) this;
        }

        public Criteria andIUptimeNotEqualTo(Date value) {
            addCriterion("i_uptime <>", value, "iUptime");
            return (Criteria) this;
        }

        public Criteria andIUptimeGreaterThan(Date value) {
            addCriterion("i_uptime >", value, "iUptime");
            return (Criteria) this;
        }

        public Criteria andIUptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("i_uptime >=", value, "iUptime");
            return (Criteria) this;
        }

        public Criteria andIUptimeLessThan(Date value) {
            addCriterion("i_uptime <", value, "iUptime");
            return (Criteria) this;
        }

        public Criteria andIUptimeLessThanOrEqualTo(Date value) {
            addCriterion("i_uptime <=", value, "iUptime");
            return (Criteria) this;
        }

        public Criteria andIUptimeIn(List<Date> values) {
            addCriterion("i_uptime in", values, "iUptime");
            return (Criteria) this;
        }

        public Criteria andIUptimeNotIn(List<Date> values) {
            addCriterion("i_uptime not in", values, "iUptime");
            return (Criteria) this;
        }

        public Criteria andIUptimeBetween(Date value1, Date value2) {
            addCriterion("i_uptime between", value1, value2, "iUptime");
            return (Criteria) this;
        }

        public Criteria andIUptimeNotBetween(Date value1, Date value2) {
            addCriterion("i_uptime not between", value1, value2, "iUptime");
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