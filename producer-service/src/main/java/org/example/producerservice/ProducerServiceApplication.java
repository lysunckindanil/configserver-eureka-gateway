package org.example.producerservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ProducerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerServiceApplication.class, args);
    }
}
