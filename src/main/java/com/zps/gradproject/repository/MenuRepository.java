package com.zps.gradproject.repository;

import com.zps.gradproject.pojo.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Zps
 * @date 2018/9/4 16:30
 **/
public interface MenuRepository extends JpaRepository<Menu,Long>, JpaSpecificationExecutor<Menu> {

    /*Menu findById(String id);

    Menu findByFoodName(String foodName);

    Menu findByIdAndDeletedIsFalse(String id,boolean delete);*/
}
