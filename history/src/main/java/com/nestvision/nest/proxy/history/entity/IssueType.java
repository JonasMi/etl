package com.nestvision.nest.proxy.history.entity;

/**
 * Created by renz on 2016/7/27.
 */
public enum IssueType {
                       EXCEPTION,
                       SCHEMA,
                       MISMATCH_KEY,
                       EXCEED_MAX,
                       NOT_REACH_MIN,
                       NULL_ELEMENT,
                       START_DATE_GREATER_THAN_END_DATE,
                       NOT_MEET_CONDITION,
                       NULL_VALUE,
                       VALUE_REGEX,
                       LOCAL_ID_MISS_REF,
                       LOCAL_REF_MISS_ID,
                       DUPLICATE_LOCAL_REF,
                       TERMINOLOGY
}
