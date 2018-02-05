package com.heihaier.springbootdemo.dozer;

import lombok.Data;
import org.dozer.Mapping;

import java.util.Date;

/**
 * @author heihaier@xfuweng.com
 * Date: 05/02/2018
 * Time: 16:02
 */
@Data
public class SourceDemo {

    @Mapping(value = "value")
    private String name;
    private int age;
    private Date date;
}
