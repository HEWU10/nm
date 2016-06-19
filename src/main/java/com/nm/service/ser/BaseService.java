package com.nm.service.ser;

import java.io.Serializable;
import java.util.List;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月07日上午11:21] 创建方法 by hw
 */
public interface BaseService<T,U extends Serializable> {

        U insert(T t);

        void insert(List<T> tes);

        void saveOrUpdate(T t);

        void update(T t);

        T getById(U id);

        void delete(T t);

        int deleteAll(T t);

        int deleteById(U id);
}
