package com.zps.gradproject.controller;

import com.zps.gradproject.pojo.Comment;
import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zps
 * @date 2018/9/18 15:59
 **/
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("/addComment")
    public Commes<Comment> add(@RequestBody Comment comment){
            return commentService.add(comment);
    }

    @RequestMapping("/deleteComment")
    public Commes<Comment> delete(@RequestParam Long id){
        return commentService.delete(id);
    }
}
