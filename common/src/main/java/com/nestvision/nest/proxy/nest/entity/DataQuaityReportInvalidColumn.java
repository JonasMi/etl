package com.nestvision.nest.proxy.nest.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "DATA_QUAITY_REPORT_INVALID_COLUMN")
public class DataQuaityReportInvalidColumn extends BaseEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 9133643322676685418L;

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String displayName;

    @Enumerated(EnumType.STRING)
    private InvalidType invalidType;

    private String invalidMessage;

    private String columnValue;

    @ManyToOne
    private DataQualityReport dataQualityReport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public InvalidType getInvalidType() {
        return invalidType;
    }

    public void setInvalidType(InvalidType invalidType) {
        this.invalidType = invalidType;
    }

    public String getInvalidMessage() {
        return invalidMessage;
    }

    public void setInvalidMessage(String invalidMessage) {
        this.invalidMessage = invalidMessage;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }

    public DataQualityReport getDataQualityReport() {
        return dataQualityReport;
    }

    public void setDataQualityReport(DataQualityReport dataQualityReport) {
        this.dataQualityReport = dataQualityReport;
    }

    public enum InvalidType {

                             REQUIRED_COLUMN_MISS,
                             LENGTH_INVALID,
                             VALUE_RANGE_INVALID
    }
}
