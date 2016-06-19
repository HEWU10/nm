package com.nm.orm.dao.impl;

import com.nm.orm.dao.ArticleDao;
import com.nm.orm.entity.Article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月06日上午16:21] 创建方法 by hw
 */
@Repository
@Qualifier("articleDao")
public class ArticleDaoImpl extends BaseDaoImpl<Article,String> implements ArticleDao{

    public ArticleDaoImpl() {
        setEntityClass(Article.class);
    }


}
