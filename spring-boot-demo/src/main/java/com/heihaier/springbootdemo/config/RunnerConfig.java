package com.heihaier.springbootdemo.config;

import com.heihaier.springbootdemo.runner.HeihaierRunner;
import com.heihaier.springbootdemo.runner.KotlinRunner;
import com.heihaier.springbootdemo.runner.SpringBootRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 10:49
 */
@Configuration
public class RunnerConfig extends BaseConfig {

    @Bean
    public HeihaierRunner heihaierRunner() {
        return new HeihaierRunner();
    }

    @Bean
    public SpringBootRunner springBootRunner() {
        return new SpringBootRunner();
    }

    @Bean
    public KotlinRunner kotlinRunner() {
        return new KotlinRunner();
    }
}
