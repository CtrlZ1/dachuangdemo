package com.example.dachuangdemo.service;

import com.example.dachuangdemo.dao.HouseDesignDao;
import com.example.dachuangdemo.model.dataBase.HouseDesign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseDesignService {
    @Autowired
    HouseDesignDao houseDesignDao;
    public List<HouseDesign> getHouseDesign(){
        return houseDesignDao.selectAll();
    }
}
