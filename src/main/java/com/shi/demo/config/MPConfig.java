package com.shi.demo.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MPConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){  //开启拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();//创建一个拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());//给拦截器增加一个分页功能

        return  interceptor;
    }
}
