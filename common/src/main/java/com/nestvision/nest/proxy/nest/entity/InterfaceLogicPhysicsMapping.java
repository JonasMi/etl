package com.nestvision.nest.proxy.nest.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

import lombok.Data;

@Data
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "INTERFACE_LOGIC_PHYSICS_MAPPING")
public class InterfaceLogicPhysicsMapping implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String physicalName;

    private String logicName;

    private String resource;

}
