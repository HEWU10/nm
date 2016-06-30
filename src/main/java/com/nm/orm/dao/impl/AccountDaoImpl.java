package com.nm.orm.dao.impl;

import com.nm.orm.dao.AccountDao;
import com.nm.orm.entity.Account;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能说明：TODO
 */
@Repository
@Qualifier("accountDao")
public class AccountDaoImpl extends BaseDaoImpl<Account, String> implements AccountDao {
    private static final String CREATEDATE = "createDate";

    public AccountDaoImpl() {
        super(Account.class);
    }

    public List<Account> findAll() {
        Criteria criteria = getCurrentSession().createCriteria(Account.class);
        criteria.addOrder(Order.desc(CREATEDATE));
        return criteria.list();
    }
}
