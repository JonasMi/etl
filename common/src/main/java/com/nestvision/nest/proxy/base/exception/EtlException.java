package com.nestvision.nest.proxy.base.exception;

/**
 * Created by 小小 on 2018/7/3 09:14
 */
public class EtlException extends RuntimeException {

    public EtlException(String message) {
        super(message);
    }

    public EtlException(String message, Throwable t) {
        super(message, t);
    }

    public EtlException(Throwable t) {
        super(t);
    }

}
