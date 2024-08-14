package com.example.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ExampleListener implements ApplicationListener<ContextStartedEvent> {

    private static final Logger log = LoggerFactory.getLogger(ExampleListener.class);

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        log.info("ExampleListener: ContextStartedEvent received - {}", event);
    }
}
