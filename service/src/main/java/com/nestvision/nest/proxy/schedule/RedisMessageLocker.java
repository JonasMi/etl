package com.nestvision.nest.proxy.schedule;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisMessageLocker implements MessageLocker {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    private long lockTimeout = 60;

    private String buildLockKey(String resource, String id) {

        return "lock:" + resource + ":" + id;
    }

    @Override
    public void lock(String ownner, String resource, String id) {

        String redisKey = buildLockKey(resource, id);
        redisTemplate.boundValueOps(redisKey).set(ownner, lockTimeout, TimeUnit.SECONDS);

    }

    @Override
    public void unlock(String resource, String id) {
        String redisKey = buildLockKey(resource, id);
        redisTemplate.delete(redisKey);
    }

    @Override
    public String getLockOwnner(String resource, String id) {
        String redisKey = buildLockKey(resource, id);
        return redisTemplate.boundValueOps(redisKey).get();
    }

}
