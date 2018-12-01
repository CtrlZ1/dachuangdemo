package com.example.dachuangdemo.dao;

import com.example.dachuangdemo.model.dataBase.HouseDesign;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HouseDesignDao {
    String TABLE_NAME=" housedesign ";
    //    String SELECT_FIELDS=" name,saleState,feature,price,sumPrize,propertise,developer,region,location ";
    String SELECT_FIELDS="*";
    public List<HouseDesign> selectOne(@Param("xx")String xx);
    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME})
    List<HouseDesign> selectAll();
}
