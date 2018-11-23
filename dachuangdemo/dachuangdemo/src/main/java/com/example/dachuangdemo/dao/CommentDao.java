package com.example.dachuangdemo.dao;

import com.example.dachuangdemo.model.dataBase.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CommentDao {
    String TABLE_NAME=" comment ";
    //    String SELECT_FIELDS=" name,saleState,feature,price,sumPrize,propertise,developer,region,location ";
    String SELECT_FIELDS="*";
    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME})
    List<Comment> selectAll();
}
