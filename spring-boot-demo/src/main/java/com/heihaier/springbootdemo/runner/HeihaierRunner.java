package com.heihaier.springbootdemo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 10:43
 */
@Order(0)
public class HeihaierRunner implements CommandLineRunner {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) {
        logger.info("hello heihaier");
    }
}
