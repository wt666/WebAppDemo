package com.tao.dao;


import com.tao.domain.User;
import com.tao.domain.UserPackage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author：涛
 * @Descripition：
 * @Date：2018/3/20 22:55
 */
public interface UserDao {
    //通过Id查询用户信息
    public User selectUserById(Integer id) throws Exception;

    //通过Username查询用户信息
    public User selectUserByUsername(String username) throws Exception;

    //通过年级的列表查询所有用户信息
    public List<User> selectUserByGrades(UserPackage userPackage) throws Exception;

    //增加用户
    public void insertUser(User user) throws Exception;

    //通过username删除用户
    public void deleteUserByUsername(String username) throws Exception;

    //更新用户信息
    public void updateUser(UserPackage userPackage) throws Exception;
}
