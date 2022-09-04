package com.satanlabs.service_framework.configs;

import com.satanlabs.service_framework.utils.HttpRequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created By Abhinav Tripathi on 2019-08-30
 */
@Configuration
public class ApplicationConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HttpRequestInterceptor()).excludePathPatterns("/actuator/**");
    }
}
