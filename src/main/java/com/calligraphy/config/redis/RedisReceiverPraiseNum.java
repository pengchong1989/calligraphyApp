package com.calligraphy.config.redis;

import com.calligraphy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章点赞量
 */
@Service
public class RedisReceiverPraiseNum {

    @Autowired
    ArticleService articleService;
    public void receiveMessage(String message) {
        System.out.println("RedisReceiverPraiseNum消息来了："+message);
        //这里是收到通道的消息之后执行的方法
        articleService.savePraise(message.split("_")[1],message.split("_")[0]);
    }
}
