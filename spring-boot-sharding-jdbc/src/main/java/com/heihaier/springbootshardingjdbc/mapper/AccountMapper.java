package com.heihaier.springbootshardingjdbc.mapper;

import com.heihaier.springbootshardingjdbc.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author heihaier@xfuweng.com
 * Date: 01/02/2018
 * Time: 16:28
 */
@Mapper
public interface AccountMapper {

    Long save(Account account);

    Account get(long id);

    @ResultType(Map.class)
    @Select("select b.*, a.id as aid, a.mobile from m_user a, m_account b where b.user_id = a.id order by a.id limit 10, 10")
    List<Map<String, Object>> query();
}
