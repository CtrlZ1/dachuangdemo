package com.example.dachuangdemo.service;

import com.example.dachuangdemo.dao.CommunityInfoDao;
import com.example.dachuangdemo.model.dataBase.CommunityInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityInfoService {
    @Autowired
    CommunityInfoDao communityInfoDao;
    public List<CommunityInfo> getCommunityInfo(){
        return communityInfoDao.selectAll();
    }
}
