package com.heihaier.springbootshardingjdbc.mapper;

import com.heihaier.springbootshardingjdbc.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author heihaier@xfuweng.com
 * Date: 18/01/2018
 * Time: 14:06
 */
@Mapper
public interface UserMapper {

    @Select("select * from m_user t where t.del_flag = 0 and t.mobile = #{mobile}")
    User getByMobile(String mobile);

    User get(long id);

    void save(User user);

    @Select("select count(0) from m_user m")
    long count();
}
