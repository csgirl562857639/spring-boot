package com.heihaier.springbootdemo.web

import com.alibaba.fastjson.JSON
import com.heihaier.springbootdemo.domain.RandomProp
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author heihaier@xfuweng.com
 * Date: 06/02/2018
 * Time: 17:29
 */
@RestController
class KotlinController(private val prop: RandomProp) : BaseController() {

    private val log = LoggerFactory.getLogger(KotlinController::class.java)

    @GetMapping("/kotlin")
    fun hello(): String {
        log.info("prop: {}", JSON.toJSONString(prop, true))
        return "hello kotlin"
    }
}