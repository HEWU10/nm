package com.nm.orm.dao.impl;

import com.nm.orm.dao.AccountOauthDao;
import com.nm.orm.entity.AccountOauth;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月06日上午16:17] 创建方法 by hw
 */
@Repository
@Qualifier("accountOauthDao")
public class AccountOauthDaoImpl extends BaseDaoImpl<AccountOauth,String> implements AccountOauthDao {

    public AccountOauthDaoImpl() {
        super(AccountOauth.class);
    }




}
