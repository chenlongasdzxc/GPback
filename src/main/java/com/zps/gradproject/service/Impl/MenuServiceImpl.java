package com.zps.gradproject.service.Impl;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.Menu;
import com.zps.gradproject.repository.MenuRepository;
import com.zps.gradproject.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Objects;

/**
 * @author Zps
 * @date 2018/9/4 16:32
 **/
@Service
public class MenuServiceImpl implements MenuService {

    /*@Autowired
    private MenuRepository menuRepository;

    *//*增加*//*
    @Override
    public Commes<Menu> add(Menu menu) {
        try {
            Menu menu1 = menuRepository.findByFoodName(menu.getFoodName());
            if (!Objects.equals(menu1.getFoodName(),menu.getFoodName())){
                menu1.setFoodName(menu.getFoodName());
                menu1.setFoodPrice(menu.getFoodPrice());
                menu1.setNumber(menu.getNumber());
                return Commes.success(menuRepository.save(menu1));
            }else {
                return Commes.errorMes("400","数据已存在");
            }
        }catch (Exception e){
            e.printStackTrace();
            return Commes.innerError("数据错误");
        }
    }

    *//*删除*//*
    @Override
    public Commes<Menu> delete(String id, boolean delete) {
        try{
            Menu menu = menuRepository.findByIdAndDeletedIsFalse(id,delete);
            if (!menu.isDeleted()){
                menu.setDeleted(true);
                return Commes.success(menuRepository.save(menu));
            }else {
                return Commes.errorMes("400","该数据不存在");
            }
        }catch (Exception e){
            e.printStackTrace();
            return Commes.innerError("数据不存在");
        }
    }

   *//* 更改*//*

    @Override
    public Commes<Menu> update(Menu menu) {
        try {
            Menu menu1 = menuRepository.findById(menu.getId());
            if (menu1.getId()!=null){
                menu1.setFoodName(menu.getFoodName());
                menu1.setFoodPrice(menu.getFoodPrice());
                menu1.setNumber(menu.getNumber());
                return Commes.success(menuRepository.save(menu1));
            }else {
                return Commes.errorMes("400","数据不存在");
            }
        }catch (Exception e){
            e.printStackTrace();
            return Commes.innerError("");
        }
    }

    *//*模糊查询*//*

    @Override
    public Commes<Menu> findFuzzy(String foodName, String foodPrice, Date date) {
        return null;
    }*/
}
