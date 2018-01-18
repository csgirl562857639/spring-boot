package com.heihaier.springbootdemo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 10:45
 */
@Order(1)
public class SpringBootRunner implements CommandLineRunner {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) throws Exception {
        logger.info("hello spring-boot!");
    }
}
