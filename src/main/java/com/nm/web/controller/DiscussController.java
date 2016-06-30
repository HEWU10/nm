package com.nm.web.controller;

import com.nm.orm.entity.Discuss;
import com.nm.service.DiscussService;
import com.nm.web.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hewu on 2016/6/27 0027.
 */
@Controller
@RequestMapping(path = "/discuss")
public class DiscussController extends BaseController {

    @Autowired
    private DiscussService discussService;

    @RequestMapping(path = "/findAll")
    public ResponseEntity<Result> findAll() {
        List<Discuss> discusses = this.discussService.findAll();
        return getResult(discusses);
    }
}
