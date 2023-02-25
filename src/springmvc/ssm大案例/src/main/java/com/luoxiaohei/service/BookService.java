package com.luoxiaohei.service;

import com.luoxiaohei.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional //3、加上事务，通常在接口上写，表示所有的方法都开启事务了
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查找
     * @param id
     * @return
     */
    public Book getId(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
