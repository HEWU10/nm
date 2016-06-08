package com.nm.service.ser.impl;

import com.nm.orm.dao.ArticleDao;
import com.nm.orm.entity.Article;
import com.nm.service.ser.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月07日上午12:00] 创建方法 by hw
 */
@Service
@Qualifier("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public String insert(Article article) {
        return this.articleDao.insert(article);
    }

    public void saveOrUpdate(Article article) {
        this.articleDao.saveOrUpdate(article);
    }

    public void insert(Collection<Article> articles) {
        this.articleDao.insert(articles);
    }

    public Article findById(String id) {
        return this.articleDao.findById(id);
    }

    public void delete(Article article) {
        this.articleDao.delete(article);
    }

    public int deleteAll(Article article) {
        return articleDao.deleteAll(article);
    }

    public int deleteById(String id) {
        return this.articleDao.deleteById(id);
    }
}
