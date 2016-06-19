package com.nm.service.impl;

import com.nm.orm.dao.ItemDao;
import com.nm.orm.entity.Item;
import com.nm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Service
@Qualifier("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Transactional
    public String insert(Item item){
        return this.itemDao.insert(item);
    }

    public void insert(List<Item> items) {
        this.itemDao.insert(items);
    }

    public void saveOrUpdate(Item item) {
        this.itemDao.saveOrUpdate(item);
    }

    public void update(Item item) {
        this.itemDao.saveOrUpdate(item);
    }

    public Item getById(String id) {
        return this.itemDao.findById(id);
    }

    public void delete(Item item) {
        this.itemDao.delete(item);
    }

    public int deleteAll(Item item) {
        return this.itemDao.deleteAll(item);
    }

    public int deleteById(String id) {
        return this.itemDao.deleteById(id);
    }

    @Transactional
    public List<Item> findAll() {
        return this.itemDao.findAll();
    }
}
