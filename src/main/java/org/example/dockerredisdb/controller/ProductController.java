package org.example.dockerredisdb.controller;

import lombok.RequiredArgsConstructor;
import org.example.dockerredisdb.model.Product;
import org.example.dockerredisdb.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/get-by-id")
    public Product getById(@RequestParam UUID id) {
        return productService.getProductById(id);
    }

}
