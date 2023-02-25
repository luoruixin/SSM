package dao.impl;

import dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//bean的生命周期

//@Component("bookDao")
@Repository("bookDao") //不建议写上面那个
@Scope("singleton")
public class BookDaoImpl implements BookDao {
//    @Value("luoruixin")  //基本数据类型使用Value进行注入
    @Value("${name}")
    private String name;
    @Override
    public void save() {
        System.out.println("book dao save..."+name);
    }

    @PostConstruct  //初始化方法
    public void init(){
        System.out.println("book dao init...");
    }

    @PreDestroy  //销毁方法
    public void destroy(){
        System.out.println("book dao destroy...");
    }
}
