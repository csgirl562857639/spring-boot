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

import java.util.stream.LongStream;

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

    @Test
    public void save() {
        LongStream.range(1, 100)
                .parallel()
                .forEach(i -> {
                    User user = new User();
                    user.setId(i);
                    user.setMobile("18511896775");
                    user.setState("0");
                    userMapper.save(user);
                });
    }

    @Test
    public void count() {
        long count = userMapper.count();
        assert count > 0;
        log.info("count: {}", count);
    }
}
