package com.nm.orm.dao.impl;

import com.nm.orm.dao.ItemDao;
import com.nm.orm.entity.Item;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Repository
@Qualifier("itemDao")
public class ItemDaoImpl extends BaseDaoImpl<Item, String> implements ItemDao {
    private ItemDaoImpl() {
        setEntityClass(Item.class);
    }



}
