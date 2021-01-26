package com.lsm.server;

import com.lsm.pojo.bookinfo;

import java.util.List;

public interface bookinfoserver {
    /**
     * 查询所有图书
     * @return
     */
    List<bookinfo> query();

    void ins();
}
