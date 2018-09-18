package com.zps.gradproject.repository;

import com.zps.gradproject.pojo.FoodMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author Zps
 * @date 2018/9/18 17:22
 *
 * 食物菜单数据操作
 **/
public interface FoodMenuRepository extends JpaRepository<FoodMenu,Long>, JpaSpecificationExecutor<FoodMenu> {

    List<FoodMenu> findByFoodNameAAndDeletedIsFalse(String foodName);
}
