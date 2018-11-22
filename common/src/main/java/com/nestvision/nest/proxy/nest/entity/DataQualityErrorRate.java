package com.nestvision.nest.proxy.nest.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

import lombok.Data;
@Data
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "DATA_QUALITY_ERROR_RATE")
public class DataQualityErrorRate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1529811881894104330L;

	@Id
    @GeneratedValue
	private Long id;

    private String upHospital;

    private Float errorRate;

    private String upHospitalName;

    private Long messageCount;
    
    private Long errorCount;
    
    private Date time;
}
