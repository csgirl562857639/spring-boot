package com.heihaier.springbootjpa.repository;

import com.heihaier.springbootjpa.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 11:20
 */
@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    User getByMobile(String mobile);

    User getByMobileAndState(String mobile, String state);
}
