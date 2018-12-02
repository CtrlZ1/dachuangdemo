package com.example.dachuangdemo.dao;

import com.example.dachuangdemo.model.dataGraph.HotPicture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HotPictureDao {
    String TABLE_NAME=" dachuang.allInfo ";
    //    String SELECT_FIELDS=" name,saleState,feature,price,sumPrize,propertise,developer,region,location ";
    String SELECT_FIELDS=" 经度,纬度,单价 ";
    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME})
    List<HotPicture> selectHP();
}
