package com.zps.gradproject.utils;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.FoodMenu;
import com.zps.gradproject.pojo.Menu;
import com.zps.gradproject.repository.FoodMenuRepository;
import com.zps.gradproject.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zps
 * @date 2018/9/18 17:04
 * 根据食物名称生成食物code
 **/
@Service
public class FoodCode {

    @Autowired
    private FoodMenuRepository foodMenuRepository;

    public Commes<FoodMenu> setFoodCode(String foodName) {
        return null;
    }
}
