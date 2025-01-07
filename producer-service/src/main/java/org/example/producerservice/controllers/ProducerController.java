package org.example.producerservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Value("${eureka.instance.instance-id}")
    String id;

    @GetMapping("/api")
    public String index() {
        return id;
    }
}
