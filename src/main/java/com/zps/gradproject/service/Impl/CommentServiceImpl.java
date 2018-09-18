package com.zps.gradproject.service.Impl;

import com.zps.gradproject.pojo.Comment;
import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.repository.CommentRepository;
import com.zps.gradproject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zps
 * @date 2018/9/18 15:54
 **/
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;


    /*添加*/
    @Override
    public Commes<Comment> add(Comment comment) {
        try {
            return Commes.success(commentRepository.save(comment));
        }catch (Exception e) {
            e.printStackTrace();
            return Commes.errorMes("400", "添加失败");
        }
    }

    /*删除*/
    @Override
    public Commes<Comment> delete(Long id) {
        try {
            Comment comment=commentRepository.findByIdAndDeletedIsFalse(id);
            comment.setDeleted(true);
            return Commes.success(commentRepository.save(comment));
        }catch (Exception e){
            e.printStackTrace();
            return Commes.errorMes("400","删除失败");
        }
    }

    /*修改*/
    @Override
    public Commes<Comment> edit(Comment comment) {
        commentRepository.findByIdAndDeletedIsFalse(comment.getId());
        try {
            return Commes.success(commentRepository.save(comment));
        }catch (Exception e){
            e.printStackTrace();
            return Commes.errorMes("400","修改失败");
        }
    }
}
