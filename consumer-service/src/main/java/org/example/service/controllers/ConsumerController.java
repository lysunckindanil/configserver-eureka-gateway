package org.example.service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private final ProducerService producerService;

    public ConsumerController(ProducerService producerService) {
        this.producerService = producerService;
    }


    @GetMapping
    public String consume() {
        return producerService.produce();
    }
}
