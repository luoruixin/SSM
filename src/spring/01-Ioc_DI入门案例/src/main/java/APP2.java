import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.BookService;

public class APP2 {
    public static void main(String[] args) {
        //1、获取Ioc容器，括号里写上文件名
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        //2、通过文件名进行加载
//        ApplicationContext ctx=new FileSystemXmlApplicationContext("C:\\Users\\luoruixin\\Desktop\\Java学习笔记\\JavaFramework\\src\\spring\\Ioc_DI入门案例\\src\\main\\resources\\applicationContext.xml");

        //获取bean
        BookService bookService =  ctx.getBean("bookService",BookService.class);
//        BookDao bookService= (BookDao) ctx.getBean(BookService.class);
        bookService.save();

    }
}
