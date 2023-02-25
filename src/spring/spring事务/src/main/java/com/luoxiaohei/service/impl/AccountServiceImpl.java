package com.luoxiaohei.service.impl;

import com.luoxiaohei.dao.AccountDao;
import com.luoxiaohei.service.AccountService;
import com.luoxiaohei.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    @Transactional  //在需要加事务的方法上面加上@Transactional
    public void transfer(String out,String in ,Double money) throws IOException {

        try{
            accountDao.outMoney(out,money);
            int i=1/0;
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);
        }


//        if(true){
//            throw new IOException();
//        }
    }
}
