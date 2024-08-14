package com.example.starter.autoconfigure;

import com.example.starter.ExampleListener;
import com.example.starter.ExampleProperties;
import com.example.starter.ExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(ExampleProperties.class)
public class ExampleAutoConfiguration {

    private static final Logger log = LoggerFactory.getLogger(ExampleAutoConfiguration.class);

    private final ExampleProperties properties;

    public ExampleAutoConfiguration(ExampleProperties properties) {
        this.properties = properties;
    }

    @Bean
    public ExampleListener exampleListener() {
        log.info("Creating ExampleListener bean");
        return new ExampleListener();
    }

    /**
     * Create a bean of type {@link ExampleService} with the specified {@link ExampleProperties}.
     * @return a new {@link ExampleService} instance
     */
    @Bean
    public ExampleService exampleService() {
        log.info("Creating ExampleService bean");
        return new ExampleService(properties);
    }
}
