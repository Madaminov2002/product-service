package org.example.dockerredisdb;

import org.example.dockerredisdb.model.Product;
import org.example.dockerredisdb.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
@EnableCaching
@EnableDiscoveryClient
public class DockerRedisDbApplication {

//    @Bean
//    public CommandLineRunner run(ProductService service) {
//
//        return args -> {
//            Product productById = service.getProductById(
//                    UUID.fromString("33e4d6d7-39b2-4fb2-bc99-3522f08c36ad")
//            );
//
//            System.out.println("Success: " + productById.getName());
//
//        };
//
//    }

    public static void main(String[] args) {
        SpringApplication.run(DockerRedisDbApplication.class, args);
    }

}
