package com.nm.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nm.orm.entity.Account;
import com.nm.service.ser.AccountService;
import com.nm.web.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Annotation;

/**
 * 功能说明：TODO
 * @return <br/>
 *         修改历史：<br/>
 *         1.[2016年05月27日上午10:45] 创建方法 by hw
 */
@RestController
@RequestMapping(path = "/account")
public class AccountController extends BaseController {

    private Logger LOG = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @RequestMapping("/hello")
    private ResponseEntity<Result> hello( HttpServletRequest request) {
        System.out.println(accountService);
        Account account  = new Account();
        account.setAddress("张三");
        accountService.saveOrUpdate(account);
        return getResult("");
    }


}
