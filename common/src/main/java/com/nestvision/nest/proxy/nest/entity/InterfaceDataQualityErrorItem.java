package com.nestvision.nest.proxy.nest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nestvision.nest.proxy.base.entity.BaseEntity;

import lombok.Data;

@Data
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "INTERFACE_DATA_QUALITY_ERROR_ITEM")
public class InterfaceDataQualityErrorItem implements Serializable {

    private static final long serialVersionUID = 1149944022834092883L;

    @Id
    @GeneratedValue
    private Long id;

    // elementComment:"出生日期"
    @Column(nullable = true)
    private String dataItemName;

    // path:"Patient/birthDate",
    @Column(nullable = true)
    private String path;

    // 校验服务异常
    @Column(nullable = false)
    private String errorMsg;

    // 不符合FHIR消息格式
    @Column(nullable = false)
    private String errorType;

    /**
     * errorCode:错误编码
     */
    // TERMINOLOGY
    @Column(nullable = false)
    private String errorCode;

    /**
     * errorDetail:错误详情
     */
    // cvc-attribute.3: 在元素 'valueDecimal' 中, 属性 'value' 的值 's' 与其类型 'decimal-primitive' 不匹配。
    @Column(nullable = false)
    private String errorDetail;

    // fullXPath:"Patient/birthDate",elementPath:元素路径
    @Column(nullable = true)
    private String elementPath;

    @ManyToOne
    @JoinColumn(name = "report_id")
    @JsonIgnore
    private InterfaceDataQualityReport interfaceDataQualityReport;

}
