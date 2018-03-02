package com.heihaier.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRedisApplicationTests {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void contextLoads() {
		stringRedisTemplate.opsForValue().set("heihaier", "asdfadfasdf", 10, TimeUnit.MINUTES);
		redisTemplate.opsForValue().set("heixiaohai", "asdfadfasdf", 10, TimeUnit.MINUTES);
		HashOperations<String, Object, Object> ops = stringRedisTemplate.opsForHash();
		ops.put("a", "b", "c");
		ops.put("a", "e", "g");
		ops.put("a", "f", "h");
		stringRedisTemplate.expire("a", 10, TimeUnit.HOURS);
	}

}
