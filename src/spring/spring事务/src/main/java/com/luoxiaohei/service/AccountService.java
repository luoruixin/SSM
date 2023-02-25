package com.luoxiaohei.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.io.IOException;

@Transactional //1、在类的外面加上这个注解更好，省得类中的每个方法都要加这个注解
public interface AccountService {

    //配置当前接口方法具有事务
//    @Transactional(rollbackFor = {IOException.class})  //表示该方法开启事务!!!!!!!!!!!!!!!!!!!!!!!
    //IOException本身不参与事务回滚，需要手动加上（error运行时异常才会默认参与回滚）

    @Transactional  //1、通常在service的接口中写
    public void transfer(String out,String in ,Double money) throws IOException;
}
