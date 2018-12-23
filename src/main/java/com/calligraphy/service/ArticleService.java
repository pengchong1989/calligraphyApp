package com.calligraphy.service;

import com.calligraphy.dto.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> articleList(String keyword, Integer type, Integer start, Integer end);

    public Article queryByid(String articleId);
}
