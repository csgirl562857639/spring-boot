package com.heihaier.springbootshardingjdbc.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author heihaier@xfuweng.com
 * Date: 01/02/2018
 * Time: 16:27
 */
@Data
public class Account implements Serializable {
    private long id;
    private long userId;
    private String state;
}
