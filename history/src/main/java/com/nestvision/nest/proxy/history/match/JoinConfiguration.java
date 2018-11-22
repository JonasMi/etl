package com.nestvision.nest.proxy.history.match;

import java.io.Serializable;

import lombok.Data;

@Data
public class JoinConfiguration implements Serializable {
    /**
    * 
    */
    private static final long serialVersionUID = -2322915928469525209L;

    private JoinType joinType;

    private String joinValueClass;

    private String joinValueData;

}
