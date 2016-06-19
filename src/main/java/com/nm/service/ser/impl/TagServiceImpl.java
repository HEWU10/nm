package com.nm.service.ser.impl;

import com.nm.orm.dao.TagDao;
import com.nm.orm.entity.Tag;
import com.nm.service.ser.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Service
@Qualifier("tagService")
public class TagServiceImpl implements TagService{

    @Autowired
    private TagDao tagDao;

    public String insert(Tag tag) {
        return this.tagDao.insert(tag);
    }

    public void insert(List<Tag> tags) {
        this.tagDao.insert(tags);
    }

    public void saveOrUpdate(Tag tag) {
        this.tagDao.saveOrUpdate(tag);
    }

    public void update(Tag tag) {
        this.tagDao.saveOrUpdate(tag);
    }

    public Tag getById(String id) {
        return this.tagDao.findById(id);
    }

    public void delete(Tag tag) {
        this.tagDao.delete(tag);
    }

    public int deleteAll(Tag tag) {
        return this.tagDao.deleteAll(tag);
    }

    public int deleteById(String id) {
        return this.tagDao.deleteById(id);
    }
}
