package com.luoxiaohei.controller;

import com.luoxiaohei.exception.BusinessException;
import com.luoxiaohei.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//异常的处理器类
@RestControllerAdvice//告诉springmvc这个类是用来处理异常的
public class ProjectExceptionAdvice {
    //处理系统异常
    @ExceptionHandler(SystemException.class)//说明这个方法是处理什么异常的
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex的对象发送给开发人员
        //返回消息
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    //处理业务异常
    @ExceptionHandler(BusinessException.class)//说明这个方法是处理什么异常的
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    //处理其他异常
    @ExceptionHandler(Exception.class)//说明这个方法是处理什么异常的
    public Result doException(Exception ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex的对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOWN_ERR,null,"系统繁忙，请稍后再试（发生未知异常）");
    }
}
