package com.nestvision.nest.proxy.fhir.entity;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@MappedSuperclass
public class FhirResourceEntity extends BaseEntity {

    /**
     *
     */
    private static final long serialVersionUID = 4787067356885318506L;

    /**
     * uid
     */
    @Id
    @Column(length = 40)
    private String uid;

    /**
     * 上传机构id
     */
    @Column(length = 50, nullable = false)
    private String upHospital;

    /**
     * 上传时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date upTime;

    /**
     * 操作状态
     */
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private OperationState operationState;

    /**
     * 处理状态
     */
    @Enumerated(EnumType.ORDINAL)
    private DealState dealState;

    /**
     * 开发商英文名
     */
    @Column(length = 20, nullable = false)
    private String developer;

    /**
     * 开发商系统类型
     */
    @Column(name = "developer_system_type", length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private SystemType developerSystemType;


    @Column(columnDefinition = "TEXT")
    private String errorMessage;

    @Deprecated
    @Column(columnDefinition = "text")
    private String errorDetail;

    @Deprecated
    @Column(length = 100)
    private String errorType;

    @Column(name = "process_result", length = 32)
    @Enumerated(EnumType.STRING)
    private ProcessResult processResult;

    @Column(name = "cdr_id", length = 36)
    private String cdrId;


    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public ProcessResult getProcessResult() {
        return processResult;
    }

    public void setProcessResult(ProcessResult processResult) {
        this.processResult = processResult;
    }

    public String getCdrId() {
        return cdrId;
    }

    public void setCdrId(String cdrId) {
        this.cdrId = cdrId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUpHospital() {
        return upHospital;
    }

    public void setUpHospital(String upHospital) {
        this.upHospital = upHospital;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public OperationState getOperationState() {
        return operationState;
    }

    public void setOperationState(OperationState operationState) {
        this.operationState = operationState;
    }

    public DealState getDealState() {
        return dealState;
    }

    public void setDealState(DealState dealState) {
        this.dealState = dealState;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public SystemType getDeveloperSystemType() {
        return developerSystemType;
    }

    public void setDeveloperSystemType(SystemType developerSystemType) {
        this.developerSystemType = developerSystemType;
    }

    /**
     * 医院操作状态枚举
     */
    public enum OperationState {

        CREATE, UPDATE, SEARCH;

        public static OperationState valueOf(int value) {
            switch (value) {
            case 0:
                return CREATE;
            case 1:
                return UPDATE;
            case 2:
                return SEARCH;
            default:
                return null;
            }
        }
    }

    /**
     * 医院处理状态枚举
     */
    public enum DealState {
        UNPROCESSED, PROCESSED

    }

    /**
     * 错误类型枚举
     */
    public enum ProcessResult {
        SUCCESS, GENERIC_EXCEPTION, VALIDATE_EXCEPTION, COORDINATOR_EXCEPTION
    }

    /**
     * 系统类型
     */
    public enum SystemType {

        his, lis, pacs
    }

    @Override
    public boolean equals(Object obj) {

        boolean equal = false;

        if (obj != null && this.getClass().isInstance(obj)) {
            FhirResourceEntity other = (FhirResourceEntity) obj;
            equal = Objects.equals(uid, other.uid);
        }
        return equal;
    }

    @Override
    public String toString() {

        return this.getClass() + "#" + uid;
    }
}
