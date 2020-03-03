package com.logging.practice.config;

import com.logging.practice.instrumentation.TaxiFareRequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class TaxiFareMvcConfig implements WebMvcConfigurer {

    @Autowired
    private TaxiFareRequestInterceptor taxiFareRequestInterceptor;

//    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(taxiFareRequestInterceptor)
                .addPathPatterns("/**/taxifare/**/");
    }
}
