package com.luoxiaohei.controller;

import com.luoxiaohei.dao.BookDao;
import com.luoxiaohei.domain.Book;
import com.luoxiaohei.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//定义为REST风格的controller
@RequestMapping("/books")//设置公共的请求路径
public class BookController {
    @Autowired
    private BookService bookService;//这里要修改一下配置，否则会报错

    @PostMapping//新增
    public Result save(@RequestBody Book book) {
        boolean flag=bookService.save(book);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping//更新图书信息
    public Result update(@RequestBody Book book) {
        boolean flag=bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag=bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getId(@PathVariable Integer id) {
//        int i=1/0;
        Book book= bookService.getId(id);
        Integer code=book!=null?Code.GET_OK:Code.GET_ERR;
        String msg=book!=null?"":"数据查询失败，请重试";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList= bookService.getAll();
        Integer code=bookList!=null?Code.GET_OK:Code.GET_ERR;//如果bookList是空集合，不能说明查询失败，可能本来就没有数据，必须要其为null
        String msg=bookList!=null?"":"数据查询失败，请重试";
        return new Result(code,bookList,msg);
    }
}
