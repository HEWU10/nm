package com.nm.orm.dao;

import com.nm.orm.entity.Article;

import java.util.List;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月06日上午16:20] 创建方法 by hw
 */
public interface ArticleDao extends BaseDao<Article,String>{

    /**
     * 查找所有的文档
     * @return
     */
    List<Article> findAll();

}
