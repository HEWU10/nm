package com.nm.web.controller;

import com.nm.orm.entity.Article;
import com.nm.service.ArticleService;
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
@RequestMapping(path = "/article")
public class ArticleController extends BaseController{

    @Autowired
    private ArticleService articleService;

    @RequestMapping(path = "/findAll")
    public ResponseEntity<Result> findAll(){
        List<Article> articleList = this.articleService.findAll();
        return getResult(articleList);
    }
}
