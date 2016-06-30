package com.nm.orm.dao;
import com.nm.orm.entity.Discuss;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
public interface DiscussDao extends BaseDao<Discuss,String> {

    /**
     * 查找所有的评论
     * @return
     */
    List<Discuss> findAll();
}
