package com.example.dachuangdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface AllInfoDao {
    String TABLE_NAME=" dachuang.allInfo ";

    @Select({"select sum(待售) as 待售,sum(期房在售) as 期房在售,sum(售罄) as 售罄,sum(现房在售) as 现房在售,sum(尾盘) as 尾盘 from",TABLE_NAME})
    Map<String, BigDecimal> getState();

    //楼盘特征词云图：低总价15,公交枢纽14,低密度13,婚房12,投资地产11,公园10,商场9,公寓8,大型超市7,轨交房6,大型社区5,品牌开发商4,改善房3,学校2,刚需房1
    @Select({"select sum(低总价) as 低总价,sum(公交枢纽) as 公交枢纽,sum(低密度) as 低密度,sum(婚房) as 婚房," +
            "sum(投资地产) as 投资地产,sum(公园) as 公园,sum(商场) as 商场,sum(公寓) as 公寓,sum(大型超市) as 大型超市 ," +
            "sum(轨交房) as 轨交房,sum(大型社区) as 大型社区,sum(品牌开发商) as 品牌开发商,sum(改善房) as 改善房" +
            ",sum(学校) as 学校,sum(刚需房) as 刚需房 from",TABLE_NAME})
    Map<String, BigDecimal> getFeature();

    @Select({"select sum(南关) as 南关,sum(朝阳) as 朝阳,sum(净月) as 净月,sum(绿园) as 绿园,sum(二道) as 二道,sum(高新) as 高新" +
            ",sum(经开) as 经开,sum(宽城) as 宽城,sum(汽开) as 汽开,sum(长春周边) as 长春周边 from",TABLE_NAME})
    Map<String, BigDecimal> getLocation();

    //<7000 <9000 <11000 <13000
    @Select({"select count(*) as price from ",TABLE_NAME," where 单价<=7000"})
    int getPrice1();

    @Select({"select count(*) as price from ",TABLE_NAME," where 单价>7000 and 单价<=9000"})
    int getPrice2();

    @Select({"select count(*) as price from ",TABLE_NAME," where 单价>9000 and 单价<=11000"})
    int getPrice3();

    @Select({"select count(*) as price from ",TABLE_NAME," where 单价>11000 and 单价<13000"})
    int getPrice4();


    @Select({"select count(*) as price from ",TABLE_NAME," where 单价>13000"})
    int getPrice5();

    @Select({"select \uFEFF楼盘名称 from",TABLE_NAME})
    List<String> getHouse();

    @Select({"select 单价 from",TABLE_NAME})
    List<Integer> getPrice();

    @Select({"select 经度 from",TABLE_NAME})
    List<Double> getCoordinate1();

    @Select({"select 纬度 from",TABLE_NAME})
    List<Double> getCoordinate2();


}
