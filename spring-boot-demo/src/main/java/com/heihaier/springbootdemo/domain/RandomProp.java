package com.heihaier.springbootdemo.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 10:53
 */
@Data
@Component
@ConfigurationProperties(prefix = "r")
public class RandomProp {
    private String intv;
    private String value;
    private String uuid;
    private String bignumber;
    private String intvalue;
    private String range;
}
