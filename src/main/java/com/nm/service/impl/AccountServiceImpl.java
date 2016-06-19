package com.nm.service.impl;

import com.nm.orm.dao.AccountDao;
import com.nm.orm.entity.Account;
import com.nm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月07日上午11:43] 创建方法 by hw
 */
@Service
@Qualifier("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    public String insert(Account account) {
        return accountDao.insert(account);
    }

    public void saveOrUpdate(Account account) {
        this.accountDao.saveOrUpdate(account);
    }

    public void insert(Collection<Account> accounts) {
        this.accountDao.insert(accounts);
    }

    public void delete(Account account) {
        this.accountDao.delete(account);
    }

    public int deleteAll(Account account) {
        return this.accountDao.deleteAll(account);
    }

    public int deleteById(String accountId) {
        return this.accountDao.deleteById(accountId);
    }

    public void insert(List<Account> tes) {
        this.accountDao.insert(tes);
    }

    public void update(Account account) {
        this.accountDao.saveOrUpdate(account);
    }

    public Account getById(String id) {
        return this.accountDao.findById(id);
    }
}
