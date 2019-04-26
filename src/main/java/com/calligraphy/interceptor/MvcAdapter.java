package com.calligraphy.interceptor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan
public class MvcAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns：添加拦截规则    excludePathPatterns： 排除拦截规则
        registry.addInterceptor(new CheckTokenInterceptor()).addPathPatterns("/**").excludePathPatterns("/error","/user/active");
        super.addInterceptors(registry);
        System.out.println("开始开始咯。。。。");
    }
}
