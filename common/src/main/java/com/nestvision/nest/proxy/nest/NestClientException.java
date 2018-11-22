package com.nestvision.nest.proxy.nest;

public class NestClientException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -2542954915924150919L;
    
    public NestClientException(String message) {
        super(message);

    }
    public NestClientException(String message, Throwable cause) {
        super(message, cause);

    }

}
