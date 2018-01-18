package com.heihaier.springbootjpa;

import com.alibaba.fastjson.JSON;
import com.heihaier.springbootjpa.domain.User;
import com.heihaier.springbootjpa.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJpaApplicationTests {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;

	@Test
	public void count() {
		long count = userRepository.count();
		assert count > 0;
		logger.info("count: {}", count);
	}

	@Test
	public void getByMobile() {
		User user = userRepository.getByMobile("18511896775");
		assert user != null;
		logger.info("user: {}", JSON.toJSONString(user, true));
	}

	@Test
	public void getByMobileAndState() {
		User user = userRepository.getByMobileAndState("18511896775", "0");
		assert user != null;
		logger.info("user: {}", JSON.toJSONString(user, true));
	}

}
