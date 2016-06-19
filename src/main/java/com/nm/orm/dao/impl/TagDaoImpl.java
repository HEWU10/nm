package com.nm.orm.dao.impl;

import com.nm.orm.dao.TagDao;
import com.nm.orm.entity.Tag;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Repository
@Qualifier("tagDao")
public class TagDaoImpl extends BaseDaoImpl<Tag,String> implements TagDao{

    public TagDaoImpl(){
        super(Tag.class);
    }
}
