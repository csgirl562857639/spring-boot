package com.heihaier.springbootdemo.dozer;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * @author heihaier@xfuweng.com
 * Date: 05/02/2018
 * Time: 16:02
 */
@Data
public class TargetDemo {
    private String value;
    private int age;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;
}
