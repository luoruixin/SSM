package com.luoxiaohei.service.impl;

import com.luoxiaohei.controller.Code;
import com.luoxiaohei.dao.BookDao;
import com.luoxiaohei.domain.Book;
import com.luoxiaohei.exception.BusinessException;
import com.luoxiaohei.exception.SystemException;
import com.luoxiaohei.service.BookService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;//这里要修改一下配置，否则会报错

    @Override
    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;
    }

    @Override
    public Book getId(Integer id) {
        //模拟一个业务异常
//        if(id==1){
//            throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐性!");
//        }

//        try {
//            int i=1/0;
//        }catch (Exception e){
//            //将可能出现的异常进行包装，转换为自定义异常
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试",e);
//        }
        return bookDao.getId(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
