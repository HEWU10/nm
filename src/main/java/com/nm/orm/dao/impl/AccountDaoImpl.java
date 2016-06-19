package com.nm.orm.dao.impl;

import com.nm.orm.dao.AccountDao;
import com.nm.orm.entity.Account;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * 功能说明：TODO
 *
 */
@Repository
@Qualifier("accountDao")
public class AccountDaoImpl extends BaseDaoImpl<Account,String> implements AccountDao {

    public AccountDaoImpl() {
        super(Account.class);
    }


}
