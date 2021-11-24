package com.example.demo;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkaroundConfig {

    @Bean
    public static BeanFactoryPostProcessor removeErrorSecurityFilter() {
        return beanFactory -> ((DefaultListableBeanFactory) beanFactory).removeBeanDefinition("errorPageSecurityInterceptor");
    }

}
