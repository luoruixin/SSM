package service;

import config.SpringConfig;
import domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.impl.AccountServiceImpl;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {
    @Autowired
    private AccountService accountService;//定义一个业务层接口

    @Test
    public void testFindById(){
        Account ac = accountService.findById(2);
        System.out.println(ac);
    }
    @Test
    public void testFindByAll(){
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
