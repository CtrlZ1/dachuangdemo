package com.example.dachuangdemo.service;

import com.example.dachuangdemo.dao.TransportDao;
import com.example.dachuangdemo.model.dataBase.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService {
    @Autowired
    TransportDao transportDao;
    public List<Transport> getTransport(){
        return transportDao.selectAll();
    }
}
