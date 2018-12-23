package com.calligraphy.dao;

import com.calligraphy.dto.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);


    Article selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    public List<Article> articleList(@Param("keyword") String keyword, @Param("type")Integer type,
                                     @Param("start")Integer start, @Param("end")Integer end);

    public Article queryByid(@Param("articleId")String articleId);
}