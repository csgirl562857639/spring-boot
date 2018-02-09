package com.heihaier.springbootdemo.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 10:45
 */
@Slf4j
@Order(1)
public class SpringBootRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("hello spring-boot!");
    }
}
