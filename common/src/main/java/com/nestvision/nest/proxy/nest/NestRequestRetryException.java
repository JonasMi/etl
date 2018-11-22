package com.nestvision.nest.proxy.nest;

public class NestRequestRetryException extends NestRequestException{

    /**
     * 
     */
    private static final long serialVersionUID = -3636465671373558007L;
    
    public Throwable cause;
    
    public NestRequestRetryException(Throwable cause){
        this.cause=cause;
    }
}
