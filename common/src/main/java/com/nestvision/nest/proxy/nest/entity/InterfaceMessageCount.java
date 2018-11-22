package com.nestvision.nest.proxy.nest.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

import lombok.Data;

@Data
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "INTERFACE_MESSAGE_COUNT")
public class InterfaceMessageCount implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private static final long serialVersionUID = -9097868596155507419L;

    private String upHospital;

    private String upHospitalName;

    private String logicInterfaceName;

    private Date upTime;

    private String physicalInterfaceName;
    

}
