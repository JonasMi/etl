package com.nestvision.nest.proxy.base.api.response;

public class EmptyRestResponse {

    private int status;

    private String msg;

    EmptyRestResponse(int status, String msg) {
        super();
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
