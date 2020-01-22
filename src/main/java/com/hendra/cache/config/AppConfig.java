package com.hendra.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@EnableCaching
public class AppConfig extends CachingConfigurerSupport
{
    @Bean
    public CacheManager cacheAccount(RedisTemplate redisTemplate)
    {
        RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);
//        Map<String, Long> expires = new HashMap<>();
//        expires.put("accountById", (long) 10);
//        expires.put("accountList", (long) 5);
        redisCacheManager.setDefaultExpiration(10);
        return redisCacheManager;
    }
}
