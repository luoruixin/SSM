package com.luoxiaohei.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {
    //propagation设置事务属性：传播行为设置为当前操作需要新事务  propagation是一个枚举
    @Transactional(propagation = Propagation.REQUIRES_NEW)  //表示要一个新事务
    void log(String out, String in, Double money);
}
