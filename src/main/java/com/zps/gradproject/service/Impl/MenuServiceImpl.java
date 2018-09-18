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

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Commes<Menu> add(Menu menu) {
        try {
            menuRepository.findByShopCodeAndDeletedIsFalse(menu.getShopCode());
            return Commes.success(menuRepository.save(menu));
        }catch (Exception e){
            e.printStackTrace();
            return Commes.errorMes("400","添加失败");
        }
    }
}
