package org.apache.ibatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.test.mapper.IUserDao;
import org.apache.ibatis.test.pojo.User;

import java.io.IOException;
import java.io.InputStream;

public class TestMain {

  public static void main(String[] args) throws IOException {
    // 指定全局配置文件
    String resource = "mybatis-config.xml";
    // 读取配置文件
    InputStream inputStream = Resources.getResourceAsStream(resource);
    // 构建sqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    // 获取sqlSession
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // SqlSession帮我生成一个实现类(给接口)
    IUserDao userMapper = sqlSession.getMapper(IUserDao.class);

    User user = userMapper.findUserById(1);
    System.out.println(user);
  }
}

