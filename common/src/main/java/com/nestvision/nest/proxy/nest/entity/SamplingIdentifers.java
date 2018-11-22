package com.nestvision.nest.proxy.nest.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

import lombok.Data;
@Data
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "SAMPLING_IDENTIFIERS")
public class SamplingIdentifers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8728597331954218537L;
	@Id
    @GeneratedValue
	private Long id;
	private String upHospital;
	
	@Column(name="identifiers", columnDefinition="longtext", nullable=true) 
	private String identifiers;
	private Date startTime;
}
