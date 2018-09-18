package com.zps.gradproject.repository;

import com.zps.gradproject.pojo.Comment;
import com.zps.gradproject.pojo.Commes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Zps
 * @date 2018/9/18 15:55
 **/
public interface CommentRepository extends JpaRepository<Comment,Long> , JpaSpecificationExecutor<Comment> {

    Comment findByUserCode(String userCode);

    Comment findByIdAndDeletedIsFalse(Long id);
}
