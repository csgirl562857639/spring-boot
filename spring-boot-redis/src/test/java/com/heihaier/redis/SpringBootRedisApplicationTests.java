package com.heihaier.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringBootRedisApplicationTests {

//	@Autowired
//	private RedisTemplate<String, String> redisTemplate;
//
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

//    @Value("${ids}")
//    private Long[] id;

    @Test
    public void contextLoads() {
//		stringRedisTemplate.opsForValue().set("heihaier", "asdfadfasdf", 10, TimeUnit.MINUTES);
//		redisTemplate.opsForValue().set("heixiaohai", "asdfadfasdf", 10, TimeUnit.MINUTES);
//		HashOperations<String, Object, Object> ops = stringRedisTemplate.opsForHash();
//		ops.put("a", "b", "c");
//		ops.put("a", "e", "g");
//		ops.put("a", "f", "h");
//		stringRedisTemplate.expire("a", 10, TimeUnit.HOURS);
        HashOperations<String, String, ConcurrentHashMap<Long, Date>> hashOperations = redisTemplate.opsForHash();
        ConcurrentHashMap<Long, Date> date = new ConcurrentHashMap();
        date.put(123L, new Date());
        hashOperations.put("1", "2", date);

        ConcurrentHashMap<Long, Date> longDateConcurrentHashMap = hashOperations.get("1", "2");
        log.info("result: {}", longDateConcurrentHashMap);

    }

    @Test
    public void test() {
//        System.out.println(id);
    }

}
