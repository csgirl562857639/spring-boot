package com.heihaier.elasticsearch.repository;

import com.heihaier.elasticsearch.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author heihaier@xfuweng.com
 * Date: 11/02/2018
 * Time: 17:41
 */
public interface UserRepositroy extends ElasticsearchRepository<User, String> {
}
