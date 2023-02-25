package service.impl;

import dao.BookDao;
import dao.UserDao;
import service.BookService;

public class BookServiceImpl implements BookService {
//    private BookDao bookDao=new BookDaoImpl();//这是原始写法
    private BookDao bookDao;//这是使用spring的写法
    private UserDao userDao;
    //2、通过构造方法进行配置注入（）DI
    public BookServiceImpl(BookDao bookDao1,UserDao userDao1) {
        this.bookDao = bookDao1;
        this.userDao=userDao1;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
    //2、进行setter注入(DI)
//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
//    public void setUserDao(UserDao userDao) {
//        this.userDao=userDao;
//    }
}
