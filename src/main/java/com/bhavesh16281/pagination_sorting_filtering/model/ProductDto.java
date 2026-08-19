package com.bhavesh16281.pagination_sorting_filtering.model;

public record ProductDto(Long id, String name, String category, double price, int stock) {
    public static ProductDto from(Product p) {
        return new ProductDto(p.getId(), p.getName(), p.getCategory(), p.getPrice(), p.getStock());
    }
}