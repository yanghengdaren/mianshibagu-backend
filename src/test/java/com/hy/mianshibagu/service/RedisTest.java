package com.hy.mianshibagu.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author <a href="https://github.com/yanghengdaren">yanghengdaren</a>
 * @from <a href="https://github.com/yanghengdaren">yanghengdaren</a>
 */
@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        ValueOperations<String, String> opsForValue = this.stringRedisTemplate.opsForValue();
        opsForValue.set("name", "lisi"); // 缓存数据
        String value = opsForValue.get("name"); // 获取缓存数据
        System.out.println(value);
    }

}
