package com.nm.orm.dao;

import com.nm.orm.entity.Item;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
public interface ItemDao extends BaseDao<Item, String> {

    /**
     * 查找所有的项目
     * @return
     */
    List<Item> findAll();

}
