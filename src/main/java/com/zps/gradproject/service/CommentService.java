package com.zps.gradproject.service;

import com.zps.gradproject.pojo.Comment;
import com.zps.gradproject.pojo.Commes;

/**
 * @author Zps
 * @date 2018/9/18 15:54
 **/
public interface CommentService {

    Commes<Comment> add(Comment comment);

    Commes<Comment> delete(Long id);

    Commes<Comment> edit(Comment comment);
}
