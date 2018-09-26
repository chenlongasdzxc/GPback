package com.zps.gradproject.repository;


import com.zps.gradproject.pojo.Weather;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author Zps
 * @date 2018/9/25 17:16
 **/
public interface CityCodeRepository extends JpaRepository<Weather,Long>, JpaSpecificationExecutor<Weather> {

   Weather findByMergerName(String mergerName);

   Weather findByShortName(String shortName);

   Weather findByName(String name);
}
