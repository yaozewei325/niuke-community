package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("construct alpha service");
    }
    @PostConstruct
    public void init() {
        System.out.println("init the service");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy the service");
    }

    public String find() {
        return alphaDao.select();
    }
}
