package com.nestvision.nest.proxy.nest.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.SystemType;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "DATA_QUALITY_REPORT")
public class DataQualityReport extends BaseEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -2249577353819077898L;

    @Id
    @GeneratedValue
    private Long id;

    private String messageType;

    private String messageId;

    private Integer invalidColumnsTotal;

    private String physicalTableName;

    private String logicTableName;

    private String messageName;

    private String identifier;

    @OneToMany(mappedBy = "dataQualityReport", cascade = CascadeType.ALL)
    private List<DataQuaityReportInvalidColumn> dataQuaityReportInvalidColumns;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Integer getInvalidColumnsTotal() {
        return invalidColumnsTotal;
    }

    public void setInvalidColumnsTotal(Integer invalidColumnsTotal) {
        this.invalidColumnsTotal = invalidColumnsTotal;
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

    public List<DataQuaityReportInvalidColumn> getDataQuaityReportInvalidColumns() {
        return dataQuaityReportInvalidColumns;
    }

    public void setDataQuaityReportInvalidColumns(List<DataQuaityReportInvalidColumn> dataQuaityReportInvalidColumns) {
        this.dataQuaityReportInvalidColumns = dataQuaityReportInvalidColumns;
    }

    public String getPhysicalTableName() {
        return physicalTableName;
    }

    public void setPhysicalTableName(String physicalTableName) {
        this.physicalTableName = physicalTableName;
    }

    public String getLogicTableName() {
        return logicTableName;
    }

    public void setLogicTableName(String logicTableName) {
        this.logicTableName = logicTableName;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}
