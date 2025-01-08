package org.example.service.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ConsumerController {

    private final ProducerService producerService;


    @GetMapping
    public String consume() {
        log.info("Consume method: called successfully");
        return producerService.produce();
    }
}
