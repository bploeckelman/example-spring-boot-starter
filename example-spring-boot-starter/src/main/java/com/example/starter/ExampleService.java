package com.example.starter;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final ExampleProperties properties;

    public ExampleService(ExampleProperties properties) {
        this.properties = properties;
    }

    public String getMessage() {
        return properties.message();
    }
}
