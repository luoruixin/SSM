package service.impl;

import dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import service.BookService;

//@Component
@Service
public class BookServiceImpl implements BookService {
    @Autowired  //自动装配--按类型进行装配(针对引用类型进行注入)
    @Qualifier("bookDao")  //想注入谁就写谁(如果有相同类型的bean)
    private BookDao bookDao;

    //Autowired自动装配可以代替set方法(原理是暴力反射)
//    public void setBookDao(BookDao bookDao){
//        this.bookDao=bookDao;
//    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
