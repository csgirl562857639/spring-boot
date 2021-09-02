package com.heihaier.springbootdemo;

import com.heihaier.springbootdemo.service.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Autowired
	private TaskService taskService;

	@Test
	public void contextLoads() {
		IntStream.range(0, 50)
				.forEach(i -> taskService.test(i + ""));
	}

}
