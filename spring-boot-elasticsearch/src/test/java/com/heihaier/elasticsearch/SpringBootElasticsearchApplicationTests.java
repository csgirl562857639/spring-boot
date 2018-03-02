package com.heihaier.elasticsearch;

import com.alibaba.fastjson.JSON;
import com.heihaier.elasticsearch.domain.User;
import com.heihaier.elasticsearch.repository.UserRepositroy;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootElasticsearchApplicationTests {

    @Autowired
    private UserRepositroy userRepositroy;

    @Test
    public void contextLoads() {
        List<User> users = IntStream.range(0, 10)
                .parallel()
                .mapToObj(i -> {
                    User user = new User();
                    user.setAge(i);
                    user.setName("heihaier" + i);
                    user.setEmail(user.getName() + "@heihaier.com");
                    return user;
                }).collect(toList());
        Iterable<User> iterable = userRepositroy.save(users);
        log.info("users: {}", JSON.toJSONString(iterable, Boolean.TRUE));
    }

}
