package com.example.interceptor.config;

import com.example.interceptor.interceptor.GeneraInterceptor;
import com.example.interceptor.interceptor.OrderInterceptor;
import jakarta.servlet.http.WebConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private GeneraInterceptor generalInterceptor;
    @Autowired
    private OrderInterceptor orderInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(generalInterceptor);
        registry.addInterceptor(orderInterceptor);
    }
}
