package com.nm.orm.dao.impl;

import com.nm.orm.dao.TagDao;
import com.nm.orm.entity.Tag;
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
@Qualifier("tagDao")
public class TagDaoImpl extends BaseDaoImpl<Tag, String> implements TagDao {
    private static final String ID = "id";
    private static final String CREATEDATE = "createDate";

    public TagDaoImpl() {
        super(Tag.class);
    }

    public List<Tag> findAll(String id) {
        Criteria criteria = getCurrentSession().createCriteria(Tag.class)
                .add(Restrictions.eq("account.id", id))
                .addOrder(Order.desc(CREATEDATE));
        return criteria.list();
    }
}
