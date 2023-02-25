package com.luoxiaohei.dao;

import com.luoxiaohei.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface BookDao {

//    @Insert("insert into tbl_book values (null,#{type},#{name},#{description}));")
    @Insert("insert into tbl_book (type,name,description) values (#{type},#{name},#{description});")//#{type}中的type是book中的属性
    public int save(Book book);//这里的int是受影响的行数

    @Update("update tbl_book set type = #{type},name=#{name},description=#{description} where id=#{id}")
    public int update(Book book);
    
    @Delete("delete from tbl_book where id=#{id};")
    public int delete(Integer id);
    
    @Select("select * from tbl_book where id=#{id};")
    public Book getId(Integer id);
    
    @Select("select * from tbl_book;")
    public List<Book> getAll();
}
