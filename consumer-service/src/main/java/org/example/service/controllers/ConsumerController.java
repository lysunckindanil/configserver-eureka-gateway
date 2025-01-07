package org.example.service.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RestController
public class ConsumerController {

    private final RestTemplate restTemplate;
    private final String url = "http://producer-server/api";

    @GetMapping
    public String consume() {
        return restTemplate.getForObject(url, String.class);
    }
}
