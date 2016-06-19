package com.nm.orm.dao.impl;

import com.nm.orm.dao.ItemDao;
import com.nm.orm.entity.Item;
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
@Qualifier("itemDao")
public class ItemDaoImpl extends BaseDaoImpl<Item, String> implements ItemDao {
    static String STATUS = "status";
    static String SORT = "sort";

    public ItemDaoImpl() {
        super(Item.class);
    }

    public List<Item> findAll() {
        Criteria criteria = this.getCurrentSession().createCriteria(Item.class);
        criteria.add(Restrictions.ge(STATUS,0));
        criteria.addOrder(Order.desc(SORT));
        return criteria.list();
    }
}
