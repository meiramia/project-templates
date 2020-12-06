package com.productcreator.config;

import com.productcreator.services.MainService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourcesConfig {
    @Bean
    public MainService getMainService() {
        return new MainService();
    }
}