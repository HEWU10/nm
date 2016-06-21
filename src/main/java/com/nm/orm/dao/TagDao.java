package com.nm.orm.dao;

import com.nm.orm.entity.Tag;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
public interface TagDao extends BaseDao<Tag,String> {

    /**
     * 查询所有的用户标签
     * @return
     */
    List<Tag> findAll(String id);
}
