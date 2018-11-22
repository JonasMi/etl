package com.nestvision.nest.proxy.schedule;

public interface MessageLocker {

    public String getLockOwnner(String resource, String id);

    public void lock(String ownner, String resource, String id);

    public void unlock(String resource, String id);

}
