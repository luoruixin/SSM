package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component  //告诉spring来加载我
@Aspect  //告诉spring这是用来做aop的
public class MyAdvice { //定义通知类

//    @Pointcut("execution(void dao.BookDao.update())")  //定义切入点
    @Pointcut("execution(* *..*Dao.update())")  //通配符定义切入点
    private void pt(){
    }

    //只会读取已经配置的切入点，ptx不会被匹配，未被匹配的方法不会得到增强

    @Before("pt()")  //绑定
    public void method(){  //定义共性功能--通知
        System.out.println(System.currentTimeMillis());
    }
}
