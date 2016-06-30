package com.nm.service;

import com.nm.orm.entity.Discuss;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
public interface DiscussService extends BaseService<Discuss, String> {

    List<Discuss> findAll();
}
