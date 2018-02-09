package com.heihaier.springbootshardingjdbc.mapper;

import com.heihaier.springbootshardingjdbc.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

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

    Long save(User user);

    @Select("select count(0) from m_user m")
    long count();

    @ResultType(User.class)
    @Select("select * from m_user t order by t.id limit #{page}, #{pageSize}")
    List<User> page(@Param("page") long page, @Param("pageSize") long pageSize);

    @Options(useGeneratedKeys = true)
    @Insert("INSERT INTO m_user(mobile, state) VALUES ( #{mobile}, #{state})")
    Long insert(User user);
}
