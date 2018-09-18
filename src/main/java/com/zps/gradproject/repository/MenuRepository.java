package com.zps.gradproject.repository;

import com.zps.gradproject.pojo.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author Zps
 * @date 2018/9/4 16:30
 **/
public interface MenuRepository extends JpaRepository<Menu,Long>, JpaSpecificationExecutor<Menu> {

    Menu findByShopCodeAndDeletedIsFalse(String shopCode);

    List<Menu> findByFoodName(String foodName);
}
