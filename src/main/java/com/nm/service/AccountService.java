package com.nm.service;

import com.nm.orm.entity.Account;

import java.util.List;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月07日上午11:17] 创建方法 by hw
 */
public interface AccountService extends BaseService<Account, String> {
    List<Account> findAll();
}
