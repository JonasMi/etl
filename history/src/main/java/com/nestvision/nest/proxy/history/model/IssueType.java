package com.nestvision.nest.proxy.history.model;

import com.nestvision.nest.proxy.history.constants.NestErrorTypes;
import com.nestvision.nest.proxy.history.model.ValidatorIssue.TerminologyIssue;

/**
 * Created by renz on 2016/7/27.
 */
public enum IssueType {
                       EXCEPTION {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.INTERNAL_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "校验服务异常";
                           }
                       },
                       SCHEMA {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.FHIR_SCHEMA_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "不符合FHIR资源结构规范";
                           }
                       },
                       MISMATCH_KEY {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.REGION_DEFINE_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "节点不符合区域规范定义";
                           }
                       },
                       EXCEED_MAX {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.REGION_DEFINE_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "节点总数超出上限";
                           }
                       },
                       NOT_REACH_MIN {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.REGION_DEFINE_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "节点总数未达下限";
                           }
                       },
                       NULL_ELEMENT {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.REGION_DEFINE_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "节点既无value属性也不存在子节点";
                           }
                       },
                       START_DATE_GREATER_THAN_END_DATE {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.REGION_DEFINE_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "开始时间大于结束时间";
                           }
                       },
                       NOT_MEET_CONDITION {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.FHIR_SCHEMA_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return name();
                           }
                       },
                       NULL_VALUE {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.REGION_DEFINE_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "值不能为空";
                           }
                       },
                       VALUE_REGEX {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.REGION_DEFINE_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "值违反正则";
                           }
                       },
                       LOCAL_ID_MISS_REF {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.REGION_DEFINE_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "本地ID未匹配到本地引用";
                           }
                       },
                       LOCAL_REF_MISS_ID {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.REGION_DEFINE_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return "本地引用未匹配到本地ID";
                           }
                       },
                       DUPLICATE_LOCAL_REF {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.FHIR_SCHEMA_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {

                               return name();
                           }
                       },
                       TERMINOLOGY {
                           @Override
                           public String nestErrorType() {

                               return NestErrorTypes.TERMINOLOGY_ERROR;
                           }

                           @Override
                           public String nestErrorMessage(ValidatorIssue issue) {
                               TerminologyIssue terminologyIssue = issue.getTerminologyIssue();
                               if (terminologyIssue != null) {
                                   return "不符合" + terminologyIssue.getCodeSystemDescription() + terminologyIssue.getCodeSystemName() + "中的值";
                               }
                               return nestErrorType();

                           }
                       };

    public abstract String nestErrorType();

    public abstract String nestErrorMessage(ValidatorIssue issue);
}
