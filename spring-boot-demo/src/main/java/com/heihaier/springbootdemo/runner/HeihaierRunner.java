package com.heihaier.springbootdemo.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 10:43
 */
@Slf4j
@Order(0)
public class HeihaierRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("hello heihaier");
    }
}
