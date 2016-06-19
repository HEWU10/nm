package com.nm.test;

import com.nm.orm.entity.Account;
import com.nm.service.ser.AccountService;
import com.nm.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hewu on 2016/6/18 0018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@PropertySource(value = "classpath:jdbc.properties")
@Transactional
@ComponentScan(value = "com.nm.service.ser")
public class AccountTest  {


    @Autowired
    private AccountService accountService;

    @Test
    @Transactional
    @Rollback(false)
    public void testAddAccount() {

        System.out.println(accountService);
        Account account = new Account();
        account.setName("李四");
        account.setType(0);
        account.setPassword(MD5Util.MD5("123456"));
        account.setEmail("718544807@qq.com");
        account.setLevel(0);
        account.setVip(0);
        account.setStatus(1);
        account.setMobile("15573114062");
        account.setAddress("杭州市西湖区");
        accountService.saveOrUpdate(account);
    }
}
