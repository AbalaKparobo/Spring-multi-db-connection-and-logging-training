package com.logging.practice.instrumentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TaxiFareRequestInterceptor extends HandlerInterceptorAdapter {

    private static Logger logger = LoggerFactory.getLogger(TaxiFareRequestInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        HttpServletRequest requestCacheWrapperObject = new ContentCachingRequestWrapper(request);
//        requestCacheWrapperObject.getParameterMap();
//        logger.trace("Intercepting incoming HTTP call " + request.getContextPath());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
//        logger.info("Intercepting response to HTTP call " + response.getContentType());
        // do something
    }
}
