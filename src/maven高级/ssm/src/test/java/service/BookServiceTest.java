package service;

import com.luoxiaohei.config.SpringConfig;
import com.luoxiaohei.domain.Book;
import com.luoxiaohei.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//这个测试类是测试spring的，不是关于springmvc的
@RunWith(SpringJUnit4ClassRunner.class)//设定类运行器
@ContextConfiguration(classes = SpringConfig.class)//spring的配置
public class BookServiceTest {

    @Autowired
    private BookService bookService;//定义业务层接口

    @Test
    public void testGetById(){
        Book book = bookService.getId(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll(){
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }
}
