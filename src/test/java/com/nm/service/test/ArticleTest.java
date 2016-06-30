package com.nm.service.test;

import com.nm.orm.entity.Account;
import com.nm.orm.entity.Article;
import com.nm.orm.entity.Item;
import com.nm.service.AccountService;
import com.nm.service.ArticleService;
import com.nm.service.ItemService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hewu on 2016/6/27 0027.
 */
@ContextConfiguration(value = "classpath:applicationContext.xml")
@PropertySource(value = "classpath:jdbc.properties")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class ArticleTest {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private AccountService accountService;
    @Autowired
    private ItemService itemService;

    @Test
    @Transactional
    @Rollback(false)
    public void testArticleAdd() {
        List<Account> accounts = this.accountService.findAll();
        Assert.assertFalse(null == accounts || accounts.size() == 0);

        List<Item> items = this.itemService.findAll();
        Assert.assertFalse(null == items || items.size() == 0);

        Article article = new Article();
        article.setId("402881e95597a5db015597a5e3840000");
        article.setAccount(accounts.get(0));
        article.setContent("adfsdfsdf");
        article.setHate(0);
        article.setItem(items.get(0));
        article.setSee(100);
        article.setStatus(1);
        article.setSupport(21);
        article.setTitle("第一篇文章");

        this.articleService.saveOrUpdate(article);
        Assert.assertNotNull(article.getId());
    }

    @Test
    @Rollback(false)
    @Transactional
    public void testFindAll() {
        List<Article> articles = this.articleService.findAll();
        Assert.assertFalse(null == articles || articles.size() == 0);
    }

}
