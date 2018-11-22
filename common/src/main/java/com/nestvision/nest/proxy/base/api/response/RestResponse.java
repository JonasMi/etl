package com.nestvision.nest.proxy.base.api.response;

public class RestResponse<T> extends EmptyRestResponse {

    private T data;

    RestResponse(int status, T data, String msg) {
        super(status, msg);

        this.data = data;

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
