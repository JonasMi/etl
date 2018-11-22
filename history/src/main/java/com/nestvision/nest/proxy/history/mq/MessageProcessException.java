package com.nestvision.nest.proxy.history.mq;

public class MessageProcessException extends RuntimeException{

    /**
     * 
     */
    private static final long serialVersionUID = -4154647512205951283L;

    public MessageProcessException() {
        super();

    }

    public MessageProcessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);

    }

    public MessageProcessException(String message, Throwable cause) {
        super(message, cause);
       
    }

    public MessageProcessException(String message) {
        super(message);
       
    }

    public MessageProcessException(Throwable cause) {
        super(cause);
       
    }
    
}
