package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component  //告诉spring来加载我
@Aspect  //告诉spring这是用来做aop的
public class MyAdvice { //定义通知类

    @Pointcut("execution(void dao.BookDao.update())")  //定义切入点
    private void pt(){}

    @Pointcut("execution(int dao.BookDao.select())")  //定义切入点
    private void pt2(){}

//    @Before("pt()")
    public void before(){
        System.out.println("before advice...");
    }

    @After("pt2()")
    public void after(){
        System.out.println("after advice");
    }

//    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice...");
        //表示对原始操作的调用
        pjp.proceed();
        System.out.println("around after advice...");
    }

//    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable { //这里的异常是防止原有的方法出现异常，其次是环绕通知的返回值都是Object
        System.out.println("around before advice...");
        //表示对原始操作的调用
        Integer ret = (Integer) pjp.proceed();
        System.out.println("around after advice...");
        return ret;//别忘了返回值
    }

//    @AfterReturning("pt2()")   //在没有抛异常的情况下才会运行
    public void afterReturning(){
        System.out.println("afterReturning advice...");
    }

//    @AfterThrowing("pt2()")    //只有抛异常才会运行
    public void afterThrowing(){
        System.out.println("afterThrowing advice...");
    }
}
