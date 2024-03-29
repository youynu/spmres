package com.youymi.app.stars.data.entity.gen;

import java.util.ArrayList;
import java.util.List;

public class DataStoreExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public DataStoreExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
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
            addCriterion("id_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeKeyIsNull() {
            addCriterion("type_key_ is null");
            return (Criteria) this;
        }

        public Criteria andTypeKeyIsNotNull() {
            addCriterion("type_key_ is not null");
            return (Criteria) this;
        }

        public Criteria andTypeKeyEqualTo(String value) {
            addCriterion("type_key_ =", value, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyNotEqualTo(String value) {
            addCriterion("type_key_ <>", value, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyGreaterThan(String value) {
            addCriterion("type_key_ >", value, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("type_key_ >=", value, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyLessThan(String value) {
            addCriterion("type_key_ <", value, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyLessThanOrEqualTo(String value) {
            addCriterion("type_key_ <=", value, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyLike(String value) {
            addCriterion("type_key_ like", value, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyNotLike(String value) {
            addCriterion("type_key_ not like", value, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyIn(List<String> values) {
            addCriterion("type_key_ in", values, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyNotIn(List<String> values) {
            addCriterion("type_key_ not in", values, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyBetween(String value1, String value2) {
            addCriterion("type_key_ between", value1, value2, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeKeyNotBetween(String value1, String value2) {
            addCriterion("type_key_ not between", value1, value2, "typeKey");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name_ is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name_ is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name_ =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name_ <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name_ >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name_ >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name_ <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name_ <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name_ like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name_ not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name_ in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name_ not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name_ between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name_ not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andItemKeyIsNull() {
            addCriterion("item_key_ is null");
            return (Criteria) this;
        }

        public Criteria andItemKeyIsNotNull() {
            addCriterion("item_key_ is not null");
            return (Criteria) this;
        }

        public Criteria andItemKeyEqualTo(String value) {
            addCriterion("item_key_ =", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotEqualTo(String value) {
            addCriterion("item_key_ <>", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyGreaterThan(String value) {
            addCriterion("item_key_ >", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyGreaterThanOrEqualTo(String value) {
            addCriterion("item_key_ >=", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyLessThan(String value) {
            addCriterion("item_key_ <", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyLessThanOrEqualTo(String value) {
            addCriterion("item_key_ <=", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyLike(String value) {
            addCriterion("item_key_ like", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotLike(String value) {
            addCriterion("item_key_ not like", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyIn(List<String> values) {
            addCriterion("item_key_ in", values, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotIn(List<String> values) {
            addCriterion("item_key_ not in", values, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyBetween(String value1, String value2) {
            addCriterion("item_key_ between", value1, value2, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotBetween(String value1, String value2) {
            addCriterion("item_key_ not between", value1, value2, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemValueIsNull() {
            addCriterion("item_value_ is null");
            return (Criteria) this;
        }

        public Criteria andItemValueIsNotNull() {
            addCriterion("item_value_ is not null");
            return (Criteria) this;
        }

        public Criteria andItemValueEqualTo(String value) {
            addCriterion("item_value_ =", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotEqualTo(String value) {
            addCriterion("item_value_ <>", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueGreaterThan(String value) {
            addCriterion("item_value_ >", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueGreaterThanOrEqualTo(String value) {
            addCriterion("item_value_ >=", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLessThan(String value) {
            addCriterion("item_value_ <", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLessThanOrEqualTo(String value) {
            addCriterion("item_value_ <=", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLike(String value) {
            addCriterion("item_value_ like", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotLike(String value) {
            addCriterion("item_value_ not like", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueIn(List<String> values) {
            addCriterion("item_value_ in", values, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotIn(List<String> values) {
            addCriterion("item_value_ not in", values, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueBetween(String value1, String value2) {
            addCriterion("item_value_ between", value1, value2, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotBetween(String value1, String value2) {
            addCriterion("item_value_ not between", value1, value2, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeIsNull() {
            addCriterion("item_data_type_ is null");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeIsNotNull() {
            addCriterion("item_data_type_ is not null");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeEqualTo(String value) {
            addCriterion("item_data_type_ =", value, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeNotEqualTo(String value) {
            addCriterion("item_data_type_ <>", value, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeGreaterThan(String value) {
            addCriterion("item_data_type_ >", value, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("item_data_type_ >=", value, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeLessThan(String value) {
            addCriterion("item_data_type_ <", value, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeLessThanOrEqualTo(String value) {
            addCriterion("item_data_type_ <=", value, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeLike(String value) {
            addCriterion("item_data_type_ like", value, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeNotLike(String value) {
            addCriterion("item_data_type_ not like", value, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeIn(List<String> values) {
            addCriterion("item_data_type_ in", values, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeNotIn(List<String> values) {
            addCriterion("item_data_type_ not in", values, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeBetween(String value1, String value2) {
            addCriterion("item_data_type_ between", value1, value2, "itemDataType");
            return (Criteria) this;
        }

        public Criteria andItemDataTypeNotBetween(String value1, String value2) {
            addCriterion("item_data_type_ not between", value1, value2, "itemDataType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ba_data_store
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ba_data_store
     *
     * @mbggenerated
     */
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