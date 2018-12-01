package com.example.dachuangdemo.dao;

import com.example.dachuangdemo.model.dataBase.CommunityInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CommunityInfoDao {
    String TABLE_NAME=" communityinfo ";
    //    String SELECT_FIELDS=" name,saleState,feature,price,sumPrize,propertise,developer,region,location ";
    String SELECT_FIELDS="*";
    public List<CommunityInfo> selectOne(@Param("xx")String xx);
    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME})
    List<CommunityInfo> selectAll();
}
