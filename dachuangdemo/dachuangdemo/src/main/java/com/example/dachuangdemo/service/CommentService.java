package com.example.dachuangdemo.service;

import com.example.dachuangdemo.dao.CommentDao;
import com.example.dachuangdemo.model.dataBase.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentDao commentDao;
    public List<Comment> getComment(){
        return commentDao.selectAll();
    }
}
