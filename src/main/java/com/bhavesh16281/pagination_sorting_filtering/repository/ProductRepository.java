package com.bhavesh16281.pagination_sorting_filtering.repository;

import com.bhavesh16281.pagination_sorting_filtering.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
