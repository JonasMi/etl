package com.nestvision.nest.proxy.nest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

import lombok.Data;

@Data
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "TABLE_LOGIC_PHYSICS_MAPPING")
public class TableLogicPhysicsMapping implements Serializable {

    private static final long serialVersionUID = -6430167137380863171L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String physicalName;

    @Column(nullable = false)
    private String logicName;

    @Column(nullable = false)
    private String logicPrimaryKeyName;

    @Column(nullable = false)
    private String physicalPrimaryKeyName;

}
