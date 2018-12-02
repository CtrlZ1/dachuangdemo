package com.example.dachuangdemo.dao;

import com.example.dachuangdemo.model.dataBase.BaseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface  BaseInfoDao {
    String TABLE_NAME=" baseinfo ";
//    String SELECT_FIELDS=" name,saleState,feature,price,sumPrize,propertise,developer,region,location ";
    String SELECT_FIELDS="*";
    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME})
    List<BaseInfo> selectAll();
    @Select({"select count(*) from ",TABLE_NAME})
    int getNum();
}
