package com.zps.gradproject.repository;

import com.zps.gradproject.pojo.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Zps
 * @date 2018/8/31 16:38
 **/
public interface MerChantRepository extends JpaRepository<Merchant,Long> , JpaSpecificationExecutor<Merchant> {

    Merchant findByCodeAndDeletedIsFalse(String code);

    Merchant findById(String id);


}
