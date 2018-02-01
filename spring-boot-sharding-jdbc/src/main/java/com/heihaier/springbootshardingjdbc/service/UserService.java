package com.heihaier.springbootshardingjdbc.service;

import com.heihaier.springbootshardingjdbc.domain.Account;
import com.heihaier.springbootshardingjdbc.domain.User;
import com.heihaier.springbootshardingjdbc.mapper.AccountMapper;
import com.heihaier.springbootshardingjdbc.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.LongStream;

/**
 * @author heihaier@xfuweng.com
 * Date: 01/02/2018
 * Time: 17:32
 */
@Slf4j
@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AccountMapper accountMapper;

    @Transactional
    public boolean save() {
        LongStream.range(1, 100)
//                .parallel()
                .forEach(i -> {
                    User user = new User();
                    user.setMobile("18511896775");
                    user.setState("0");
                    userMapper.save(user);
                    log.info("id: {}", user.getId());
                    Account account = new Account();
                    account.setUserId(user.getId());
                    account.setState("0");
                    accountMapper.save(account);
                });

        return Boolean.TRUE;
    }
}
