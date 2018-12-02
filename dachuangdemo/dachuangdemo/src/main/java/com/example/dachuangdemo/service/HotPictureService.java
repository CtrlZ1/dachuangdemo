package com.example.dachuangdemo.service;

import com.example.dachuangdemo.dao.HotPictureDao;
import com.example.dachuangdemo.model.dataGraph.HotPicture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotPictureService {
    @Autowired
    HotPictureDao hotPictureDao;
    public List<HotPicture> getHotPicture(){
        return hotPictureDao.selectHP();
    }

}
