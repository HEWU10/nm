package com.nm.service.test;

import com.nm.orm.entity.Account;
import com.nm.orm.entity.Item;
import com.nm.orm.entity.Tag;
import com.nm.service.AccountService;
import com.nm.service.TagService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
@PropertySource(value = "classpath:jdbc.properties")
public class TagTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private TagService tagService;
    @Autowired
    private AccountService accountService;

    /**
     * 不存在事务，不粗腰进行回滚注解
     */
    @Test
    public void testFindAll() {
        List<Tag> tags = this.tagService.findAll("");
        Assert.assertNotNull(tags);
        System.out.println(tags.get(0).getName());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testInsert() {
        Tag tag = new Tag();
        tag.setName("测试标签");
        Account account = this.accountService.getById("402881e955693fb70155693fbf75000a");
        tag.setAccount(account);
        this.tagService.insert(tag);
    }
}
