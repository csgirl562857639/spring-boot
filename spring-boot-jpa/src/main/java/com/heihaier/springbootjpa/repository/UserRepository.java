package com.heihaier.springbootjpa.repository;

import com.heihaier.springbootjpa.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 11:20
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    User getByMobile(String mobile);

    User getByMobileAndState(String mobile, String state);
}
