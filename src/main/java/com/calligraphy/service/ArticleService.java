package com.calligraphy.service;

import com.calligraphy.dto.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleService {
    public List<Article> articleList(String keyword, Integer type, Integer start, Integer end);

    public Integer articleListcount(String keyword, Integer type);

    public Article queryByid(String articleId);

    public void saveRead(String articleId, String userId);

    public void savePraise(String articleId,String userId);

    public void saveReported(String articleId,String userId);

}
