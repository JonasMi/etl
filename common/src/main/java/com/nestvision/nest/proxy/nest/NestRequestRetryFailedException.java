package com.nestvision.nest.proxy.nest;

import com.nestvision.nest.proxy.nest.client.NestResponse;

public class NestRequestRetryFailedException extends NestRequestException{
    
    /**
     * 
     */
    private static final long serialVersionUID = 2884156699687869327L;
    
    private NestResponse nestResponse;
    
    public NestRequestRetryFailedException(NestResponse nestResponse){
        
        this.nestResponse=nestResponse;
    }
}
