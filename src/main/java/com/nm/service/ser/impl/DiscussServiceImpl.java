package com.nm.service.ser.impl;

import com.nm.orm.dao.DiscussDao;
import com.nm.orm.entity.Discuss;
import com.nm.service.ser.BaseService;
import com.nm.service.ser.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Service
@Qualifier("discussService")
public class DiscussServiceImpl implements DiscussService{
    @Autowired
    private DiscussDao discussDao;


    public String insert(Discuss discuss) {
        return this.discussDao.insert(discuss);
    }

    public void insert(List<Discuss> discusses) {
        this.discussDao.insert(discusses);
    }

    public void saveOrUpdate(Discuss discuss) {
        this.discussDao.saveOrUpdate(discuss);
    }

    public void update(Discuss discuss) {
        this.discussDao.saveOrUpdate(discuss);
    }

    public Discuss getById(String id) {
        return this.discussDao.findById(id);
    }

    public void delete(Discuss discuss) {
        this.delete(discuss);
    }

    public int deleteAll(Discuss discuss) {
        return this.discussDao.deleteAll(discuss);
    }

    public int deleteById(String id) {
        return this.deleteById(id);
    }
}
