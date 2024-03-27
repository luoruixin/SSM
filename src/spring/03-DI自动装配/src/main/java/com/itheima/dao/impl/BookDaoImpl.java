package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;

    //1、setter方法注入
//    public void setDatabaseName(String databaseName) {
//        this.databaseName = databaseName;
//    }
//
//    public void setConnectionNum(int connectionNum) {
//        this.connectionNum = connectionNum;
//    }

    //2、构造器注入
    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }
}
