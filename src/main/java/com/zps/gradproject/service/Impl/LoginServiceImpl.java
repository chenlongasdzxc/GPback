package com.zps.gradproject.service.Impl;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.User;
import com.zps.gradproject.repository.UserRepository;
import com.zps.gradproject.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Zps
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;


    /*登录*/
    /*@Override
    public Commes login(String userName, String userPassword) {
        try {
            User user = userRepository.findByUserName(userName); 账号错误会报空指针异常
            if (Objects.equals(user.getUserPassword(),userPassword)){
                return Commes.successMes();
            }else {
                return Commes.errorMes("400","密码错误");
            }
        }catch (Exception e){
            e.printStackTrace();
            return Commes.errorMes("401","账号不存在");
        }
    }*/

    @Override
    public Commes<User> login(String userName, String userPassword) {
          User user = userRepository.findByUserName(userName);
          try {
              if (user!=null){
                  if (Objects.equals(user.getUserPassword(),userPassword)){
                      return Commes.successMes();
                  }else {
                      return Commes.errorMes("400","密码不正确");
                  }
              }else {
                  return Commes.errorMes("401","账号不存在");
              }
          }catch (Exception e){
              e.printStackTrace();
              return Commes.innerError("");
          }
    }
}
