package com.nm.service;

import com.nm.orm.entity.Tag;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
public interface TagService extends BaseService<Tag,String>{

    /**
     * 通过作者ID查询该作者的所有的标签
     * @param id
     * @return
     */
    List<Tag> findAll(String id);
}
