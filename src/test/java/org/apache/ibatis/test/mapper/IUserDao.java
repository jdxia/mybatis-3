package org.apache.ibatis.test.mapper;

import org.apache.ibatis.test.pojo.User;

public interface IUserDao {
  // 遵循四个原则
  // 接口方法名 == User.xml中的id名字
  // 返回值类型与Mapper.xml文件中返回值类型要一致
  // 方法入参类型与Mapper.xml中入参类型要一致
  // 命名空间绑定此接口
  public User findUserById(Integer id);
}
