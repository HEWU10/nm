package com.nm.orm.dao.impl;

import com.nm.orm.dao.ArticleDao;
import com.nm.orm.entity.Article;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    private ArticleDaoImpl() {
        super(Article.class);
    }

    static String STATUS = "static";

    public List<Article> findAll() {
        Criteria criteria = getCurrentSession().createCriteria(Article.class);
//                .add(Restrictions.gt(STATUS,0));
        return criteria.list();
    }
}
