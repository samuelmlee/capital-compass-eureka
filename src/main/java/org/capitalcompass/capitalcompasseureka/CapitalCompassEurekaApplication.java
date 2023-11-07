package org.capitalcompass.capitalcompasseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CapitalCompassEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapitalCompassEurekaApplication.class, args);
    }

}
