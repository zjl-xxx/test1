package com.itheima.mapper;

import com.itheima.pojo.Brand;
import com.itheima.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface brandmapper {

    @Select("select * from tb_brand")

    List<Brand> selectAll();

    @Insert("insert into  tb_brand values(null,#{brand_name},#{company_name},#{ordered},#{description},#{status})")
    void add(Brand brand);

    @Select("select * from tb_brand where id=#{id}")
    Brand selectByid(int id);

    @Update("update tb_brand set brand_name=#{brand_name},company_name=#{company_name},ordered=#{ordered},description=#{description},status=#{status} where id=#{id}")
    void update(Brand brand);

    @Delete("delete from tb_brand where id=#{id}")
    void delete(int id);

}
