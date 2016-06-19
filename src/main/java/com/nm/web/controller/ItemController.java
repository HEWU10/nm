package com.nm.web.controller;

import com.nm.orm.entity.Item;
import com.nm.service.ItemService;
import com.nm.web.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hewu on 2016/6/19 0019.
 */
@Controller
@RequestMapping(path = "/item")
public class ItemController extends BaseController{

    @Autowired
    private ItemService itemService;

    @RequestMapping(path = "findAll")
    public ResponseEntity<Result> findAll(){
        List<Item> items = this.itemService.findAll();
        return getResult(items);
    }


}
