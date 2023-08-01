package com.example.interceptor.config;

import com.example.interceptor.interceptor.OrderInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig2 extends WebMvcConfigurationSupport {

    @Autowired
    private OrderInterceptor orderInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(orderInterceptor).addPathPatterns("/order/**").excludePathPatterns("/order/excludeFromInterceptor");
    }
}
