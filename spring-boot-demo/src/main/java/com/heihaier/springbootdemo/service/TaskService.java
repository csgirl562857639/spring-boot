package com.heihaier.springbootdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author heihaier@mmears.com
 * Date: 15/03/2018
 * Time: 17:58
 */
@Slf4j
@Service
public class TaskService {

    @Async
    public void test(String str) {
        log.info("str: {}", str);
    }
}
