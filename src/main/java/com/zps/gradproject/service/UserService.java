package com.zps.gradproject.service;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author Zps
 * @date 2018/8/29 16:51
 **/
public interface UserService {

    Commes<User> deleteUser(Long id);

    Commes<User> addUser(User user);

    Commes<User> editUser(User user);
}
