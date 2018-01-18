package com.heihaier.springbootjpa.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 11:16
 */
@Data
@Table(name = "t_user")
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String mobile;

    private String state;
}
