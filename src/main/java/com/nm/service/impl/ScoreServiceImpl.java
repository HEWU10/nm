package com.nm.service.impl;

import com.nm.orm.dao.ScoreDao;
import com.nm.orm.entity.Score;
import com.nm.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Service
@Qualifier("scoreService")
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    public String insert(Score score) {
        return this.scoreDao.insert(score);
    }

    public void insert(List<Score> scoreses) {
        this.scoreDao.insert(scoreses);
    }

    public void saveOrUpdate(Score score) {
        this.scoreDao.saveOrUpdate(score);
    }

    public void update(Score score) {
        this.scoreDao.saveOrUpdate(score);
    }

    public Score getById(String id) {
        return this.scoreDao.findById(id);
    }

    public void delete(Score score) {
        this.scoreDao.delete(score);
    }

    public int deleteAll(Score score) {
        return this.scoreDao.deleteAll(score);
    }

    public int deleteById(String id) {
        return this.scoreDao.deleteById(id);
    }
}
