package com.itheima.service;


import com.itheima.mapper.usermapper;
import com.itheima.pojo.User;
import com.itheima.util.sqlsessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class userservice {
    SqlSessionFactory sqlSessionFactory= sqlsessionFactory.getSqlsessionFactory();
    public User select(User user1)
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();

        usermapper usermp=sqlSession.getMapper(usermapper.class);

        User user=usermp.select(user1);
        sqlSession.close();
        return user;
    }

    public boolean add(User user){
        SqlSession sqlSession=sqlSessionFactory.openSession();

        usermapper usermp=sqlSession.getMapper(usermapper.class);

        User user1=usermp.selectbyusername(user.getUsername());

        if(user1==null)
        {
            usermp.add(user);
            sqlSession.commit();
            sqlSession.close();
        }
        return (user1==null);
    }

    public boolean selectByusername(String name){
        SqlSession sqlSession=sqlSessionFactory.openSession();

        usermapper usermp=sqlSession.getMapper(usermapper.class);

        User user1=usermp.selectbyusername(name);
        if (user1 == null)
        {
            return false;
        }else {
           return true;
        }
    }
}
