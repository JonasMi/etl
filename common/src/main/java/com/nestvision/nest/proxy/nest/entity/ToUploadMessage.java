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
@Table(name = BaseEntity.TABLE_PREFIX + "TO_UPLOAD_MESSAGE")
public class ToUploadMessage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8096391836647317092L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String physicalInterfaceName;

    private String logicInterfaceName;
    
    private String upHospital;
    
    private String upHospitalName;
    
    private String identifier;
    
    private Long count;
    
    private String type;
    
    private Date upTime;
}
