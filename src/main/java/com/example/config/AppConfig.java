package com.example.config;

import com.example.beans.mongo.MongoRepairOrder;
import com.example.beans.redis.RedisRepairOrder;
import com.example.beans.redis.RedisStudent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class AppConfig {
    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<String, byte[]> redisTemplate() {
        RedisTemplate<String, byte[]> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        return template;
    }
}
