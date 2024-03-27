package dao.impl;

import dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//bean的生命周期

//@Component("bookDao")
@Repository("bookDao2") //不建议写上面那个
public class BookDaoImpl2 implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save...2");
    }

}
