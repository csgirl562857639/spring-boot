package com.heihaier.springbootshardingjdbc;

import com.alibaba.fastjson.JSON;
import com.heihaier.springbootshardingjdbc.domain.User;
import com.heihaier.springbootshardingjdbc.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootShardingJdbcApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test() {
		User user = userMapper.getByMobile("18519330157");
		assert user != null;
		log.info("user: {}", JSON.toJSONString(user, true));
	}

	@Test
	public void get() {
		User user = userMapper.get(100060);
		assert user != null;
		log.info("user: {}", JSON.toJSONString(user, true));
	}

}
