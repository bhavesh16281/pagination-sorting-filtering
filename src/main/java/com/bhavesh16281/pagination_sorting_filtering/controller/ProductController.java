package com.bhavesh16281.pagination_sorting_filtering.controller;

import com.bhavesh16281.pagination_sorting_filtering.model.PageResponse;
import com.bhavesh16281.pagination_sorting_filtering.model.Product;
import com.bhavesh16281.pagination_sorting_filtering.model.ProductDto;
import com.bhavesh16281.pagination_sorting_filtering.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Method -1
    // @GetMapping
    // public Page<Product> getAllProducts(Pageable pageable) {
    //     return productRepository.findAll(pageable);
    // }

    //Method -2
    @GetMapping
    public PageResponse<ProductDto> getAllProducts(
            @PageableDefault(size = 10, sort = "id") Pageable pageable) {

        Page<Product> productPage = productRepository.findAll(pageable);
        Page<ProductDto> dtoPage = productPage.map(ProductDto::from);
        return PageResponse.from(dtoPage);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}