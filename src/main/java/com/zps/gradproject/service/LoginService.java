package com.zps.gradproject.service;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.Message;
import com.zps.gradproject.pojo.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Zps
 **/
public interface LoginService {

   /* Commes<User> update(String userName,String password);*/

    Commes<User> login(String userName, String userPassword,HttpServletRequest request);


}
