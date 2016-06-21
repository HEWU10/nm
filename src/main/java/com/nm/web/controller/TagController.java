package com.nm.web.controller;

import com.nm.orm.entity.Tag;
import com.nm.service.TagService;
import org.jboss.jandex.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hewu on 2016/6/20 0020.
 */
@Controller
@RequestMapping("/tag")
public class TagController extends BaseController{

    @Autowired
    private TagService tagService;

    @RequestMapping("/findAll")
    public ResponseEntity<com.nm.web.util.Result> findAll(){
        List<Tag> tags = this.tagService.findAll("402881e955693fb70155693fbf75000a");
        return getResult(tags);
    }
}
