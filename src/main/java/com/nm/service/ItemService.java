package com.nm.service;

import com.nm.orm.entity.Item;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
public interface ItemService extends BaseService<Item,String> {

    /**
     * 查询所有的栏目
     * @return
     */
    List<Item> findAll();

}
