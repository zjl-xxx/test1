package com.itheima.service;

import com.itheima.mapper.brandmapper;
import com.itheima.pojo.Brand;
import com.itheima.util.sqlsessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class brandservice {

    SqlSessionFactory sqlSessionFactory=sqlsessionFactory.getSqlsessionFactory();
    public List<Brand> selectAll() throws IOException {
       /* String resource = "mybaties_conflg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);*/

        SqlSession sqlSession=sqlSessionFactory.openSession();

        brandmapper brandmp=sqlSession.getMapper(brandmapper.class);

        List<Brand> brands=brandmp.selectAll();

        sqlSession.close();
        return brands;
    }

    public void add(Brand brand){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        brandmapper brandmp=sqlSession.getMapper(brandmapper.class);
        brandmp.add(brand);
        sqlSession.commit();
        sqlSession.close();
    }

    public Brand selectByid(int id)
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        brandmapper brandmp=sqlSession.getMapper(brandmapper.class);
        Brand brand =brandmp.selectByid(id);
        sqlSession.close();
        return brand;
    }
    public void delete(int id)
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        brandmapper brandmp=sqlSession.getMapper(brandmapper.class);
        brandmp.delete(id);
        sqlSession.commit();
        sqlSession.close();

    }

    public void update(Brand brand){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        brandmapper brandmp=sqlSession.getMapper(brandmapper.class);
        brandmp.update(brand);
        sqlSession.commit();
        sqlSession.close();

    }

}
