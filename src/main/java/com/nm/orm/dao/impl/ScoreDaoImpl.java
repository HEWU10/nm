package com.nm.orm.dao.impl;

import com.nm.orm.dao.BaseDao;
import com.nm.orm.dao.ScoreDao;
import com.nm.orm.entity.Score;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Repository
@Qualifier("scoreDao")
public class ScoreDaoImpl extends BaseDaoImpl<Score,String> implements ScoreDao {

    public ScoreDaoImpl(){
        super(Score.class);
    }
}
