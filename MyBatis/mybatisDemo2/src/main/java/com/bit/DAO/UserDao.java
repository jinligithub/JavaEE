package com.bit.DAO;

import com.bit.domain.User;

import java.util.List;

/**
 * DAO 层
 */
public interface UserDao {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

}
