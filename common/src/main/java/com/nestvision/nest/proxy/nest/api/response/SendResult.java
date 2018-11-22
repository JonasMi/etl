package com.nestvision.nest.proxy.nest.api.response;

public class SendResult {

    private Boolean sended;

    private Boolean success;

    private String message;
    
    public SendResult(Boolean sended, Boolean success, String message) {
        super();
        this.sended = sended;
        this.success = success;
        this.message = message;
    }

    public Boolean getSended() {
        return sended;
    }

    public void setSended(Boolean sended) {
        this.sended = sended;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
