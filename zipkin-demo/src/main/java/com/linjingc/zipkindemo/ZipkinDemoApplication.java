package com.linjingc.zipkindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZipkinDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinDemoApplication.class, args);
    }

}
