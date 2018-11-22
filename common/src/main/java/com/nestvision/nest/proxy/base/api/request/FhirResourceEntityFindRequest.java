package com.nestvision.nest.proxy.base.api.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.annotation.DateTimeFormat;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FhirResourceEntityFindRequest<T extends FhirResourceEntity> extends PageQueryRequest<T> {

    private String uid;

    private String upHospital;

    private String developer;

    private String operationState;

    private String dealState;

    private String errorType;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date afterUpTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date untilUpTime;
    
    private Boolean dealSuccess;
    @Override
    public Specification<T> convertToSpecification() {

        return new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                List<Predicate> list = new ArrayList<Predicate>();
                if (!StringUtils.isBlank(uid)) {
                    list.add(cb.equal(root.get("uid"), uid));
                }
                if (!StringUtils.isBlank(upHospital)) {
                    list.add(cb.equal(root.get("upHospital"), upHospital));
                }
                if (!StringUtils.isBlank(developer)) {
                    list.add(cb.equal(root.get("developer"), developer));
                }
                if (!StringUtils.isBlank(operationState)) {

                    try {
                        OperationState operationStateEnum = OperationState.valueOf(operationState);
                        list.add(cb.equal(root.get("operationState"), operationStateEnum));
                    } catch (Exception e) {
                        log.warn("提交的操作状态参数无效:" + operationState, e);
                    }

                }
                if (!StringUtils.isBlank(dealState)) {

                    try {
                        DealState dealStateEnum = DealState.valueOf(dealState);
                        list.add(cb.equal(root.get("dealState"), dealStateEnum));
                    } catch (Exception e) {
                        log.warn("提交的处理状态参数无效:" + dealState, e);
                    }

                }
                if (!StringUtils.isBlank(errorType)) {
                    list.add(cb.equal(root.get("errorType"), errorType));
                }

                if (afterUpTime != null) {
                    list.add(cb.greaterThanOrEqualTo(root.get("upTime"), afterUpTime));
                }
                if (untilUpTime != null) {
                    list.add(cb.lessThanOrEqualTo(root.get("upTime"), untilUpTime));
                }
                if(dealSuccess!=null){
                    if(BooleanUtils.isFalse(dealSuccess)){
                        list.add(cb.isNotNull(root.get("errorType"))); 
                    }else{
                        list.add(cb.isNull(root.get("errorType"))); 
                    }
                }
                Predicate[] p = new Predicate[list.size()];
                return cb.and(list.toArray(p));
            }

        };
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUpHospital(String upHospital) {
        this.upHospital = upHospital;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setOperationState(String operationState) {
        this.operationState = operationState;
    }
    public void setDealState(String dealState) {
        this.dealState = dealState;
    }
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public void setAfterUpTime(Date afterUpTime) {
        this.afterUpTime = afterUpTime;
    }

    public void setUntilUpTime(Date untilUpTime) {
        this.untilUpTime = untilUpTime;
    }
    public Boolean getDealSuccess() {
        return dealSuccess;
    }
    public void setDealSuccess(Boolean dealSuccess) {
        this.dealSuccess = dealSuccess;
    }
}
