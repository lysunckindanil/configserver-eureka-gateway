package org.example.producerservice.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProducerController {
    @Value("${eureka.instance.instance-id}")
    String id;

    @GetMapping("/api")
    public String produce() {
        log.info("produce method: called successfully");
        return id;
    }
}
