package com.nm.service.test;

import com.mysql.jdbc.AssertionFailedException;
import com.nm.orm.entity.Account;
import com.nm.service.AccountService;
import com.nm.commons.util.MD5Util;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hewu on 2016/6/18 0018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@PropertySource(value = "classpath:jdbc.properties")
@Transactional
@ComponentScan(value = "com.nm.service.impl")
public class AccountTest{

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

    @Test
    @Transactional
    @Rollback(false)
    public void testUpdateAccount() {
        Account account = this.accountService.getById("402881e95567e162015567e1687e0000");
        account.setName("李四12");
        accountService.saveOrUpdate(account);
    }

    @Test
    public void testFindById(){
        Account account = this.accountService.getById("402881e95567e162015567e1687e0000");
        System.out.println(account.getEmail());
        Assert.assertNotNull(account);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testBathInsert(){
        List<Account> accountList = new ArrayList<Account>();
        Account account1  = null;
        for(int i =0 ;i <10 ; i ++){
            account1 = new Account();
            account1.setName("李四1");
            account1.setType(0);
            account1.setPassword(MD5Util.MD5("123456"));
            account1.setEmail("718544807@qq1.com");
            account1.setLevel(0);
            account1.setVip(0);
            account1.setStatus(1);
            account1.setMobile("15573114061");
            account1.setAddress("杭州市西湖区1");
            accountList.add(account1);
        }
        try{
            this.accountService.insert(accountList);
        }catch (Exception e){
            new AssertionFailedException(e);
        }
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testDeleteById(){
        try {
            this.accountService.deleteById("402881e95567e162015567e1687e0000");
        }catch (Exception e){
            e.getMessage();
            new AssertionFailedException(e);
        }
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteAll(){
        this.accountService.deleteAll(new Account());
    }

}
