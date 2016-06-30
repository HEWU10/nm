package com.nm.service;

import com.nm.orm.dao.BaseDao;
import com.nm.orm.entity.Article;

import java.util.List;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月07日上午11:18] 创建方法 by hw
 */
public interface ArticleService extends BaseDao<Article,String>{

    /**
     * 查找所有的文章
     * @return
     */
    List<Article> findAll();
}
