package com.calligraphy.service.impl;

import com.calligraphy.dao.ArticleMapper;
import com.calligraphy.dto.Article;
import com.calligraphy.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService {
    @Resource
    ArticleMapper articleMapper;

    @Override
    public List<Article> articleList(String keyword, Integer type, Integer start, Integer end) {
        return articleMapper.articleList(keyword,type,start,end);
    }

    @Override
    public Article queryByid(String articleId) {
        return articleMapper.queryByid(articleId);
    }
}
