
import config.SpringConfig;
import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//aop的核心是动态代理模式，对原有对象进行增强
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao=ctx.getBean(BookDao.class);
        int num = bookDao.select();
        System.out.println(num);
    }
}
