package com.calligraphy.service.impl;

import com.calligraphy.dao.ArticleMapper;
import com.calligraphy.dto.Article;
import com.calligraphy.service.ArticleService;
import com.calligraphy.util.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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
    public Integer articleListcount(String keyword, Integer type) {
        return articleMapper.articleListcount(keyword,type);
    }

    @Override
    public Article queryByid(String articleId) {
        return articleMapper.queryByid(articleId);
    }

    @Override
    public void saveRead(String articleId, String userId) {
        articleMapper.saveRead(articleId,userId);
    }

    @Override
    public void savePraise(String articleId, String userId) {
        articleMapper.savePraise(articleId,userId);
    }

    @Override
    public void saveReported(String articleId, String userId) {
        articleMapper.saveReported(articleId,userId);
    }
}
