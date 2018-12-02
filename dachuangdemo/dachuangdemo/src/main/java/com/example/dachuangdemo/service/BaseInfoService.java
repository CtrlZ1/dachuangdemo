package com.example.dachuangdemo.service;

import com.example.dachuangdemo.dao.BaseInfoDao;
import com.example.dachuangdemo.model.dataBase.BaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseInfoService {
    @Autowired
    BaseInfoDao baseInfoDao;
    public List<BaseInfo> getBaseInfo(){
        return baseInfoDao.selectAll();
    }
    public int getNum(){
        return baseInfoDao.getNum();
    }

}
