package com.nm.service.test;

import com.nm.orm.entity.Article;
import com.nm.orm.entity.Discuss;
import com.nm.service.ArticleService;
import com.nm.service.DiscussService;
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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@PropertySource(value = "classpath:jdbc.properties")
@Transactional
public class DiscussTest {

    @Autowired
    private DiscussService discussService;
    @Autowired
    private ArticleService articleService;

    @Test
    @Transactional
    @Rollback(false)
    public void test() {
        List<Article> articles = this.articleService.findAll();
        Assert.assertFalse(null == articles || articles.size() == 0);

        Discuss discuss = new Discuss();
        discuss.setContent(new String("这个文章写得好").getBytes());
        discuss.setFloor(0);
        discuss.setHate(1);
        discuss.setSupport(1);
        discuss.setArticle(articles.get(0));
        discuss.setStatus(1);
        this.discussService.insert(discuss);
    }

    @Test
    @Transactional
    public void testFindAll() {
        List<Discuss> discusses = this.discussService.findAll();
        Assert.assertFalse(null == discusses || discusses.size() == 0);
    }

}
