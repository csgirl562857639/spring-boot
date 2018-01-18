package com.heihaier.springbootdemo.web;

import com.alibaba.fastjson.JSON;
import com.heihaier.springbootdemo.domain.RandomProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 10:38
 */
@RestController
public class DemoController extends BaseController {

    @Value("${message}")
    private String message;

    @Autowired
    private RandomProp prop;

    @GetMapping
    public String hello() {
        logger.info("message: {}", message);
        return "hello " + message;
    }

    @GetMapping(value = "/random")
    public RandomProp random() {
        logger.info("prop: {}", JSON.toJSONString(prop, true));
        return prop;
    }
}
