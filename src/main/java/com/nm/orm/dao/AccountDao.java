package com.nm.orm.dao;

import com.nm.orm.entity.Account;

import java.util.List;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月06日上午15:49] 创建方法 by hw
 */
public interface AccountDao extends BaseDao<Account, String> {

    List<Account> findAll();

}
