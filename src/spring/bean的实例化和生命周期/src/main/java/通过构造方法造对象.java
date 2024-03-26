import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//常用
public class 通过构造方法造对象 {
    public static void main(String[] args) {

        //通过构造方法造对象

        //获取IOC容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();//注册关闭钩子

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        bookDao.save();

        //关闭容器
        ctx.close();
    }
}
