package com.docswebapps.docsdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DocsDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocsDiscoveryServiceApplication.class, args);
    }

}
