package com.zps.gradproject.controller;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.User;
import com.zps.gradproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Zps
 * @date 2018/8/29 17:26
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /*@RequestMapping("/deleteUser")
    public Commes<User> deleteUser(@RequestParam String id){
        return userService.deleteUser(id);
    }*/

   /* @RequestMapping()
    public Commes<User> updateUser(@RequestParam String userName,
                                   @RequestParam String userPassword,
                                   @RequestParam String birthday,
                                   @RequestParam String email,
                                   @RequestParam String imgUrl,
                                   @RequestParam String phone,
                                   @RequestParam String favoriteFood){
        return userService.updateUser();
    }*/

    @RequestMapping("/addUser")
    public Commes<User> addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
