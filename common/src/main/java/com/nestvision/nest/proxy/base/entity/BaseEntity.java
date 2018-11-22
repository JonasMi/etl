package com.nestvision.nest.proxy.base.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -2355620466928081576L;
    public static final String TABLE_PREFIX = "T_";

}
