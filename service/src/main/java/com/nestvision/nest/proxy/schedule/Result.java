package com.nestvision.nest.proxy.schedule;

public class Result {

    private long successTotal;

    private long cancelTotal;

    private long errorTotal;

    public void increment(Result result) {
        incrementCancelTotal(result.cancelTotal);
        incrementErrorTotal(result.errorTotal);
        incrementSuccessTotal(result.successTotal);
    }

    public long getTotal() {
        return errorTotal + cancelTotal + successTotal;
    }

    public long getSuccessTotal() {
        return successTotal;
    }

    public void setSuccessTotal(long successTotal) {
        this.successTotal = successTotal;
    }

    public void incrementSuccessTotal(long count) {
        this.successTotal += count;
    }

    public long getCancelTotal() {
        return cancelTotal;
    }

    public void setCancelTotal(long cancelTotal) {
        this.cancelTotal = cancelTotal;
    }

    public void incrementCancelTotal(long count) {
        this.cancelTotal += count;
    }

    public long getErrorTotal() {
        return errorTotal;
    }

    public void setErrorTotal(long errorTotal) {
        this.errorTotal = errorTotal;
    }

    public void incrementErrorTotal(long count) {
        this.errorTotal += count;
    }
}
