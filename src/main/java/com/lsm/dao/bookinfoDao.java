package com.lsm.dao;

import com.lsm.pojo.bookinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface bookinfoDao {
    /**
     * 查询所有图书
     * @return
     */
    List<bookinfo> query();

    void ins(bookinfo bookinfo);
}
