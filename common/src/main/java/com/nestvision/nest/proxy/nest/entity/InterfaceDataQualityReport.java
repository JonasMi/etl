package com.nestvision.nest.proxy.nest.entity;

import java.io.Serializable;
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;

import lombok.Data;

@Data
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "INTERFACE_DATA_QUALITY_REPORT")
public class InterfaceDataQualityReport implements Serializable {

    private static final long serialVersionUID = 5258193148164136144L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String physicalInterfaceName;

    @Column(nullable = false)
    private String logicInterfaceName;

    @Column(nullable = false)
    private String messageId;

    private Integer errorDataItemTotal;
    
    @Column(columnDefinition = "longtext")
    @JsonIgnore
    private String messageContent;

    @Column(nullable = false)
    private String upHospitalName;

    @Column(nullable = false)
    private String identifier;
    
    private String type;
    //1 消息 2.validator 错误 3.正确  4.coordinator错误
    private int status;

    @OneToMany(mappedBy = "interfaceDataQualityReport", cascade = CascadeType.ALL)
    private List<InterfaceDataQualityErrorItem> interfaceDataQualityErrorItems;
    

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

}
