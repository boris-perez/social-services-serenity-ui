package com.dharbor.set.application.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Ivan Alban
 */
@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Getter
    @Value("${app.url}")
    private String url;
}
