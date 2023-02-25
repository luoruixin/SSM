package com.luoxiaohei.dao;

import com.luoxiaohei.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//下面这个注解别忘了加
@Mapper  //告诉springboot这里要其创建一个自动代理对象
public interface BookDao {

    @Select("select * from tbl_book where id=#{id}")
    public Book getById(Integer id);
}
