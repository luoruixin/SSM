import config.SpringConfig;
import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.BookService;

//纯注解开发
public class AppForAnnotation {
    public static void main(String[] args) {
        //3、加载配置文件类---这是第三种获取容器类的方法
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService=ctx.getBean(BookService.class);//这里因为BookService中的注解没有名字
        System.out.println(bookService);
        bookService.save();
        ctx.close();

    }
}
