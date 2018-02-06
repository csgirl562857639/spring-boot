package com.heihaier.springbootmybatis.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

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
    private LocalDateTime createDate;
}
