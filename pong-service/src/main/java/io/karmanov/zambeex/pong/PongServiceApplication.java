package io.karmanov.zambeex.pong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PongServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PongServiceApplication.class, args);
    }
}
