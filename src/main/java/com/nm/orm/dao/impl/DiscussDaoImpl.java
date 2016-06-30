package com.nm.orm.dao.impl;

import com.nm.orm.dao.DiscussDao;
import com.nm.orm.entity.Discuss;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Repository
@Qualifier("discussDao")
public class DiscussDaoImpl extends BaseDaoImpl<Discuss, String> implements DiscussDao {
    public DiscussDaoImpl() {
        super(Discuss.class);
    }

    private static final String MODIFY_DATE = "modifyDate";
    private static String STATUS = "status";

    public List<Discuss> findAll() {
        Criteria criteria = getCurrentSession().createCriteria(Discuss.class).addOrder(Order.desc(MODIFY_DATE));
//                .add(Restrictions.gt(STATUS,1))
        return criteria.list();
    }
}
