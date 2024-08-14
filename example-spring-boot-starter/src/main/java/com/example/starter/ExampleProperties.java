package com.example.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Custom application properties for the example starter library
 * @param message The message to display from the library-provided ExampleService
 */
@ConfigurationProperties(prefix = "example")
public record ExampleProperties(
    String message
) {
    public static final String DEFAULT_MESSAGE = "Hello from the example starter library!";

    public ExampleProperties {
        if (message == null) {
            message = DEFAULT_MESSAGE;
        }
    }
}
