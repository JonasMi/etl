package com.nestvision.nest.proxy.base.api.response;

import java.util.Date;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.SystemType;

public class FhirResourceRecord {
    /**
     * uid
     */
    private String uid;

    /**
     * 上传机构id
     */
    private String upHospital;

    /**
     * 上传时间
     */
    private Long upTime;

    /**
     * 操作状态
     */
    private OperationState operationState;

    /**
     * 处理状态
     */
    private DealState dealState;

    /**
     * 开发商英文名
     */
    private String developer;

    /**
     * 开发商系统类型
     */
    private SystemType developerSystemType;

    /**
     * 错误类型
     */
    private String errorType;

    public FhirResourceRecord(FhirResourceEntity fhirResourceEntity) {

        this.uid = fhirResourceEntity.getUid();
        this.upHospital = fhirResourceEntity.getUpHospital();
        Date upTime = fhirResourceEntity.getUpTime();
        if (upTime != null) {
            this.upTime = upTime.getTime();
        }
        this.operationState = fhirResourceEntity.getOperationState();
        this.dealState = fhirResourceEntity.getDealState();
        this.developer = fhirResourceEntity.getDeveloper();
        this.developerSystemType = fhirResourceEntity.getDeveloperSystemType();
        this.errorType = fhirResourceEntity.getErrorType();

    }

    public String getUid() {
        return uid;
    }

    public String getUpHospital() {
        return upHospital;
    }

    public Long getUpTime() {
        return upTime;
    }

    public OperationState getOperationState() {
        return operationState;
    }

    public DealState getDealState() {
        return dealState;
    }

    public String getDeveloper() {
        return developer;
    }

    public SystemType getDeveloperSystemType() {
        return developerSystemType;
    }

    public String getErrorType() {
        return errorType;
    }

}
