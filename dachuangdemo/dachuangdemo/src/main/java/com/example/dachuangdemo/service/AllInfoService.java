package com.example.dachuangdemo.service;

import com.example.dachuangdemo.dao.AllInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AllInfoService {
    @Autowired
    AllInfoDao allInfoDao;
    public Map<String, BigDecimal> getState(){
        return allInfoDao.getState();
    }

    public Map<String, BigDecimal> getFeature(){
        return allInfoDao.getFeature();
    }

    public Map<String, BigDecimal> getLocation(){
        return allInfoDao.getLocation();
    }

    public List<Integer> getPrice(){
        List<Integer> price=new ArrayList<Integer>();
        price.add(allInfoDao.getPrice1());
        price.add(allInfoDao.getPrice2());
        price.add(allInfoDao.getPrice3());
        price.add(allInfoDao.getPrice4());
        price.add(allInfoDao.getPrice5());
        return price;
    }

    public Map<String,Integer> getHouseAndPrice(){
        List<String> list1=allInfoDao.getHouse();
        List<Integer> list2=allInfoDao.getPrice();
        Map<String,Integer> map=new HashMap<String, Integer>();  ;
        for (int x=0;x<list1.size();x++) {
            map.put(list1.get(x),list2.get(x));
        }
        return map;
    }

    public Map<String,List<Double>> getHouseAndCoordinate(){
        List<String> list1=allInfoDao.getHouse();
        List<Double> Coordinate1=allInfoDao.getCoordinate1();
        List<Double> Coordinate2=allInfoDao.getCoordinate2();
//        List<List<Double>> lists=new ArrayList<>();
//        lists.add(Coordinate1);
//        lists.add(Coordinate2);
        Map<String,List<Double>> map=new HashMap<String, List<Double>>();

        for(int x=0;x<list1.size();x++){
            List<Double> t=new ArrayList<>();
            t.add(Coordinate1.get(x));
            t.add(Coordinate2.get(x));
            map.put(list1.get(x),t);
        }

        return map;
    }

}
