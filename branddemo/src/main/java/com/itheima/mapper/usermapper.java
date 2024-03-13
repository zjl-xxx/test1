package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface usermapper {
    @Select("select * from tb_users where username=#{username} and password=#{password}")
    User select(User user);
    @Select("select *from tb_users where username=#{username}")
    User selectbyusername(String username);
    @Insert("insert into tb_users value(null,#{username},#{password})")
    int add( User user);
}
