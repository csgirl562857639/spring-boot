package com.heihaier.springbootdemo.runner

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.core.annotation.Order

/**
 * @author heihaier@xfuweng.com
 * Date: 06/02/2018
 * Time: 18:22
 */
@Order(2)
class KotlinRunner : CommandLineRunner {

    private val log = LoggerFactory.getLogger(KotlinRunner::class.java)

    override fun run(vararg p0: String?) {
        log.info("hello, kotlin")
    }
}