package com.nm.orm.dao.impl;

import com.nm.orm.dao.DiscussDao;
import com.nm.orm.entity.Discuss;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Repository
@Qualifier("discussDao")
public class DiscussDaoImpl extends BaseDaoImpl<Discuss, String> implements DiscussDao {
    public DiscussDaoImpl(){
        super(Discuss.class);
    }

}
