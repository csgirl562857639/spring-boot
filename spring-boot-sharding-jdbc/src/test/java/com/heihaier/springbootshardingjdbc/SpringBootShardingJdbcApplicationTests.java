package com.heihaier.springbootshardingjdbc;

import com.alibaba.fastjson.JSON;
import com.heihaier.springbootshardingjdbc.domain.Account;
import com.heihaier.springbootshardingjdbc.domain.User;
import com.heihaier.springbootshardingjdbc.mapper.AccountMapper;
import com.heihaier.springbootshardingjdbc.mapper.UserMapper;
import com.heihaier.springbootshardingjdbc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootShardingJdbcApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserService userService;

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
        userService.save();
    }

    @Test
    public void count() {
        long count = userMapper.count();
        assert count > 0;
        log.info("count: {}", count);
    }

    @Test
    public void page() {
        List<User> list = userMapper.page(30L, 10L);
        assert list.size() > 0;
        log.info("list: {}", JSON.toJSONString(list, Boolean.TRUE));
    }

    @Test
    public void getAccount() {
//        Account account = accountMapper.get(0l);
//        log.info("account: {}", JSON.toJSONString(account, Boolean.TRUE));

        Account entity = new Account();
        entity.setUserId(0L);
        entity.setState("0");
        accountMapper.save(entity);
        log.info("id: {}", entity.getId());
    }

    @Test
    public void query() {
        List<Map<String, Object>> list = accountMapper.query();
        assert list.size() > 0;
        log.info("list: {}", JSON.toJSONString(list, Boolean.TRUE));
    }
}
