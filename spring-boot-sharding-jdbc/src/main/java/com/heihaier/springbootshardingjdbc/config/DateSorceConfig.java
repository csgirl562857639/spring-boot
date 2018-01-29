package com.heihaier.springbootshardingjdbc.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author heihaier@xfuweng.com
 * Date: 29/01/2018
 * Time: 14:39
 */
//@Configuration
public class DateSorceConfig {

//    @Primary
//    @Bean(name = "master")
//    @ConfigurationProperties(prefix = "spring.datasource.druid.master")
//    public DataSource masterDataSource() {
//        return DruidDataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "slave")
//    @ConfigurationProperties(prefix = "spring.datasource.druid.slave")
//    public DataSource slaveDataSource() {
//        return DruidDataSourceBuilder.create().build();
//    }
}
