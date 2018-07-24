package com.jz.account.mapper;


import com.jz.account.model.User;

import java.util.List;

public interface UserMapper{

    List<User> queryUserList(User user);

    void delectUser(Integer id);

    User getUser(Integer id);

    void updateUser(User user);

    void insertUser(User user);
}