package com.nestvision.nest.proxy.schedule;

public class MessageSendException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1335046712481886111L;

    private boolean sendError;

    private boolean sendCancel;

    public MessageSendException() {
        super();

    }

    public MessageSendException(String arg0, Throwable arg1, boolean sendError, boolean sendCancel) {
        super(arg0, arg1);
        this.sendError = sendError;
        this.sendCancel = sendCancel;
    }

    public MessageSendException(String arg0, boolean sendError, boolean sendCancel) {
        super(arg0);
        this.sendError = sendError;
        this.sendCancel = sendCancel;

    }

    public MessageSendException(Throwable arg0, boolean sendError, boolean sendCancel) {
        super(arg0);
        this.sendError = sendError;
        this.sendCancel = sendCancel;

    }

    public boolean isSendError() {
        return sendError;
    }

    public boolean isSendCancel() {
        return sendCancel;
    }

}
