package com.heihaier.springbootweb.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author heihaier@xfuweng.com
 * Date: 05/02/2018
 * Time: 14:36
 */
@Slf4j
@Controller
public class DemoController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name, Model model) {
        log.info("name: {}", name);
        model.addAttribute("name", name);

        return "hello";
    }
}
