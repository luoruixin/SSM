package dao.impl;

import dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.lang.instrument.Instrumentation;

public class BookDaoImpl implements BookDao, InitializingBean, DisposableBean {

    //框架的基础是反射，即使构造方法前面是private，也可以调用其构造方法
    public BookDaoImpl() {
        System.out.println("book dao constructor is running ....");
    }

    public void save() {
        System.out.println("book dao save ...");
    }

    //模拟初始化方法
    public void init(){
        System.out.println("init..");
    }

    public void destory(){
        System.out.println("destory...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
