package com.zps.gradproject.service.Impl;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.User;
import com.zps.gradproject.repository.UserRepository;
import com.zps.gradproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @author Zps
 * @date 2018/8/29 16:52
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

   /* *删除用户
    * */

    @Override
    public Commes<User> deleteUser(String id) {
        try {
            User user = userRepository.findByIdAndDeletedIsFalse(id);
            user.setDeleted(true);
            return Commes.success(userRepository.save(user));
        }catch (Exception e){
            e.printStackTrace();
            return Commes.errorMes("400","已删除，数据不存在");
        }
    }

    /*
    * 添加用户
    * */

    @Override
    public Commes<User> addUser(User user) {
        try {
            if (userRepository.findByUserName(user.getUserName())==null){
                return Commes.success(userRepository.save(user));
            }else {
                return Commes.errorMes("400","账号已存在");
            }
        }catch (Exception e){
            e.printStackTrace();
            return Commes.innerError("错误");
        }
    }
}
