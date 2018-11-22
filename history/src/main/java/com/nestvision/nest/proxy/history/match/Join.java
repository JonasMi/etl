package com.nestvision.nest.proxy.history.match;

import java.io.Serializable;

public class Join implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 5126022661125664965L;

     JoinType joinType;

     Object joinValue;

     Join(JoinType joinType, Object joinValue) {
        this.joinType = joinType;
        this.joinValue = joinValue;
    }
  
}
