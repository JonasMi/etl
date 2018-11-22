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
@Table(name = BaseEntity.TABLE_PREFIX + "MESSAGE_CONFIRMATION")
public class MessageConfirmation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5674460105383496775L;
	@Id
	@GeneratedValue
	private Long id;
	
	private String nestmessageId;
	
	private String hospital;
	
	private String upHospital;
	
	private String interfaceName;
	
	private String logicInterfaceName;
	
	private Date upTime;
	
	private String identifier;
	
	private int status;

}
