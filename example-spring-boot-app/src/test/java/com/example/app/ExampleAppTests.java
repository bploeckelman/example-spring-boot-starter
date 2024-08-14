package com.example.app;

import com.example.starter.ExampleProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.reactive.server.WebTestClient;

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ExampleAppTests {

    WebTestClient webClient;

    @BeforeEach
    void setup(@LocalServerPort int port) {
        webClient = WebTestClient.bindToServer()
                .baseUrl(STR."http://localhost:\{port}")
                .build();
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testGetExample(@Autowired ExampleProperties properties) {
        webClient
                .get().uri("/example")
                .accept(MediaType.TEXT_PLAIN)
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo(properties.message());
    }
}
