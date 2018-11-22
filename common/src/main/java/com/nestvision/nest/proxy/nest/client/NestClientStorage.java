package com.nestvision.nest.proxy.nest.client;

public interface NestClientStorage {

    public NestClient fetchCenterNestClient(String cn);

    public NestClient fetchFrontNestClient(String cn);
}
