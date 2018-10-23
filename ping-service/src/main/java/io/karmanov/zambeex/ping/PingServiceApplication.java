package io.karmanov.zambeex.ping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PingServiceApplication.class, args);
    }
}
