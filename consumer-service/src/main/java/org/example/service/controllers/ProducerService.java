package org.example.service.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@RequiredArgsConstructor
@EnableFeignClients
@Service
public class ProducerService {
    private final ProducerClient producerClient;


    @GetMapping
    public String produce() {
        log.info("Produce method: called successfully");
        return producerClient.produce();
    }

    @FeignClient("producer-service")
    interface ProducerClient {
        @RequestMapping(method = RequestMethod.GET, value = "/api")
        String produce();
    }
}
