package com.heihaier.elasticsearch.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author heihaier@xfuweng.com
 * Date: 11/02/2018
 * Time: 17:36
 */
@Data
@Document(indexName = "heihaier", type = "user", shards = 1, replicas = 0, refreshInterval = "-1")
public class User {
    @Id
    private String id;

    private String name;

    private String email;

    private int age;
}
