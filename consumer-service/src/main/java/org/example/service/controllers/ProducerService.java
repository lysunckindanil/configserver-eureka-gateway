package org.example.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@EnableFeignClients
@Service
public class ProducerService {
    private final ProducerClient producerClient;

    @Autowired
    public ProducerService(ProducerClient producerClient) {
        this.producerClient = producerClient;
    }

    @GetMapping
    public String produce() {
        return producerClient.produce();
    }

    @FeignClient("producer-service")
    interface ProducerClient {
        @RequestMapping(method = RequestMethod.GET, value = "/producer-service/api")
        String produce();
    }
}
