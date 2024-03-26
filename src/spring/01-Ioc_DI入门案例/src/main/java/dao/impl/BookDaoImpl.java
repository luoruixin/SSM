package dao.impl;

import dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;
    //2、使用构造方法对基本数据类型进行DI注入
    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

//    //1、使用setter方法对基本数据类型进行配置注入   配置文件中使用value
//    public void setConnectionNum(int connectionNum) {
//        this.connectionNum = connectionNum;
//    }
//    public void setDatabaseName(String databaseName) {
//        this.databaseName = databaseName;
//    }

    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }
}
