package com.nestvision.nest.proxy.nest;

public class NestRequestNotFoundException extends NestRequestException{

    /**
     * 
     */
    private static final long serialVersionUID = -7373200939249977559L;
    private String tableName;
    private String id;
    public NestRequestNotFoundException(String tableName, String id) {
        super();
        this.tableName = tableName;
        this.id = id;
    }
    
}
