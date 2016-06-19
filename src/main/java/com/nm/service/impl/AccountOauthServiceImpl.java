package com.nm.service.impl;

import java.util.Collection;
import java.util.List;

import com.nm.orm.entity.AccountOauth;
import com.nm.service.AccountOauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nm.orm.dao.AccountOauthDao;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月07日上午11:54] 创建方法 by hw
 */
@Service
@Qualifier("accountOauthService")
public class AccountOauthServiceImpl implements AccountOauthService {

    @Autowired
    private AccountOauthDao accountOauthDao;

    public String insert(AccountOauth id) {
        return accountOauthDao.insert(id);
    }

    public void saveOrUpdate(AccountOauth accountOauth) {
        this.accountOauthDao.saveOrUpdate(accountOauth);
    }

    public void insert(Collection<AccountOauth> accounts) {
        this.accountOauthDao.insert(accounts);
    }

    public void delete(AccountOauth account) {
        this.accountOauthDao.delete(account);
    }

    public int deleteAll(AccountOauth accountOauth) {
        return this.accountOauthDao.deleteAll(accountOauth);
    }

    public int deleteById(String id) {
        return this.accountOauthDao.deleteById(id);
    }

    public void insert(List<AccountOauth> tes) {
        this.accountOauthDao.insert(tes);
    }

    public void update(AccountOauth accountOauth) {
        this.accountOauthDao.saveOrUpdate(accountOauth);
    }

    public AccountOauth getById(String id) {
        return this.accountOauthDao.findById(id);
    }
}
