package com.heihaier.springbootdemo.web;

import com.alibaba.fastjson.JSON;
import com.heihaier.springbootdemo.domain.RandomProp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 10:38
 */
@Slf4j
@RestController
public class DemoController extends BaseController {

    @Value("${message}")
    private String message;

    @Autowired
    private RandomProp prop;

    @GetMapping
    public String hello() {
        log.info("message: {}", message);
        return "hello " + message;
    }

    @GetMapping(value = "/random")
    public RandomProp random() {
        log.info("prop: {}", JSON.toJSONString(prop, true));
        return prop;
    }
}
