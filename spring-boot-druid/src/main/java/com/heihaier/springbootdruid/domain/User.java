package com.heihaier.springbootdruid.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 14:05
 */
@Data
public class User implements Serializable {
    private Long id;
    private String mobile;
    private String state;
}
