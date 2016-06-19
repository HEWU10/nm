package com.nm.service.test;

import com.nm.orm.entity.Item;
import com.nm.service.ItemService;
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
@ContextConfiguration(value="classpath:applicationContext.xml")
@PropertySource(value = "classpath:jdbc.properties")
public class ItemTest extends AbstractTransactionalJUnit4SpringContextTests{

    @Autowired
    private ItemService itemService;

    /**
     * 不存在事务，不粗腰进行回滚注解
     */
    @Test
    public void testFindAll(){
        List<Item> items = this.itemService.findAll();
        Assert.assertNotNull(items);
        System.out.println(items.get(0).getName());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testInsert(){
        Item item = new Item();
        item.setName("政务热点");
        item.setSort(0);
        item.setStatus(1);
        this.itemService.insert(item);
    }
}
