package com.zps.gradproject.repository;

import com.zps.gradproject.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * @author Zps
 **/
public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {

    User findByUserName(String userName);

    User findByIdAndDeletedIsFalse(Long id);


}
