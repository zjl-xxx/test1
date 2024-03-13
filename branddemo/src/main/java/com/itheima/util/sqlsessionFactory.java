package com.itheima.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class sqlsessionFactory {

        private static SqlSessionFactory sqlsessionFactory;
        static {
            try {
                String resource = "mybaties_conflg.xml";
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static SqlSessionFactory getSqlsessionFactory(){
            return sqlsessionFactory;
        }
    }


