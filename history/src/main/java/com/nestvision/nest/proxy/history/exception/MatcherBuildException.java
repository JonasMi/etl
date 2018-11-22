package com.nestvision.nest.proxy.history.exception;

public class MatcherBuildException extends RuntimeException{

    /**
     * 
     */
    private static final long serialVersionUID = 3222615861149512358L;
    
    public MatcherBuildException(String message) {
        super(message);
       
    }
    public MatcherBuildException(String message, Throwable t) {
        super(message, t);
       
    }
    
}
