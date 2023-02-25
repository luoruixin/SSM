package spring.IOC_DI注解管理第三方bean.src.main.java.dao.impl;

import spring.IOC_DI注解管理第三方bean.src.main.java.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//bean的生命周期

//@Component("bookDao")
@Repository("bookDao") //不建议写上面那个
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save...");
    }


}
