package com.example.dachuangdemo.service;

import com.example.dachuangdemo.dao.SaleInfoDao;
import com.example.dachuangdemo.model.dataBase.SaleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleInfoService {
    @Autowired
    SaleInfoDao saleInfoDao;
    public List<SaleInfo> getSaleInfo(){
        return saleInfoDao.selectAll();
    }
}
