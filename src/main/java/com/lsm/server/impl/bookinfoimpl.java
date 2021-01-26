package com.lsm.server.impl;

import com.lsm.dao.bookinfoDao;
import com.lsm.pojo.bookinfo;
import com.lsm.server.bookinfoserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookinfoimpl implements bookinfoserver {
@Autowired
private bookinfoDao bookinfoDao;

    public void setBookinfoDao(com.lsm.dao.bookinfoDao bookinfoDao) {
        this.bookinfoDao = bookinfoDao;
    }

    @Override
    public List<bookinfo> query() {
        System.out.println("我看你想搞事");
        List<bookinfo> query = bookinfoDao.query();
        System.out.println(query);
        return query;
    }

    @Override
    public void ins() {
        bookinfo booki1nfo=new bookinfo(6,"asd","asd");
        bookinfoDao.ins(booki1nfo);
    }

}
