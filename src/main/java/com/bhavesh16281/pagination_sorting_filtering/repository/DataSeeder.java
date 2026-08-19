package com.bhavesh16281.pagination_sorting_filtering.repository;

import com.bhavesh16281.pagination_sorting_filtering.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataSeeder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        productRepository.save(new Product("Laptop", "Electronics", 999.99, 10));
        productRepository.save(new Product("Phone", "Electronics", 599.99, 25));
        productRepository.save(new Product("Headphones", "Electronics", 149.99, 50));
        productRepository.save(new Product("Desk Chair", "Furniture", 179.99, 15));
        productRepository.save(new Product("Standing Desk", "Furniture", 399.99, 8));
        productRepository.save(new Product("Bookshelf", "Furniture", 89.99, 20));
        productRepository.save(new Product("Coffee Maker", "Appliances", 79.99, 30));
        productRepository.save(new Product("Blender", "Appliances", 49.99, 40));
        productRepository.save(new Product("Toaster", "Appliances", 29.99, 35));
        productRepository.save(new Product("Running Shoes", "Sportswear", 89.99, 60));
        productRepository.save(new Product("Yoga Mat", "Sportswear", 24.99, 100));
        productRepository.save(new Product("Water Bottle", "Sportswear", 14.99, 200));
        productRepository.save(new Product("Keyboard", "Electronics", 89.99, 45));
        productRepository.save(new Product("Mouse", "Electronics", 29.99, 80));
        productRepository.save(new Product("Monitor", "Electronics", 299.99, 12));
        productRepository.save(new Product("Webcam", "Electronics", 59.99, 30));
        productRepository.save(new Product("USB Cable", "Electronics", 9.99, 150));
        productRepository.save(new Product("Desk Lamp", "Furniture", 49.99, 25));
        productRepository.save(new Product("Filing Cabinet", "Furniture", 129.99, 10));
        productRepository.save(new Product("Office Chair", "Furniture", 249.99, 12));
        productRepository.save(new Product("Bed Frame", "Furniture", 399.99, 6));
        productRepository.save(new Product("Nightstand", "Furniture", 99.99, 18));
        productRepository.save(new Product("Microwave", "Appliances", 129.99, 20));
        productRepository.save(new Product("Oven", "Appliances", 599.99, 5));
        productRepository.save(new Product("Refrigerator", "Appliances", 999.99, 3));
        productRepository.save(new Product("Dishwasher", "Appliances", 799.99, 4));
        productRepository.save(new Product("Washing Machine", "Appliances", 699.99, 2));
        productRepository.save(new Product("Dryer", "Appliances", 649.99, 2));
        productRepository.save(new Product("T-Shirt", "Sportswear", 19.99, 120));
        productRepository.save(new Product("Shorts", "Sportswear", 29.99, 90));
        productRepository.save(new Product("Jacket", "Sportswear", 79.99, 40));
        productRepository.save(new Product("Socks", "Sportswear", 9.99, 200));
        productRepository.save(new Product("Sneakers", "Sportswear", 119.99, 55));
        productRepository.save(new Product("Backpack", "Sportswear", 49.99, 70));
        productRepository.save(new Product("Dumbbell Set", "Sportswear", 99.99, 30));
        productRepository.save(new Product("Resistance Bands", "Sportswear", 19.99, 80));
        productRepository.save(new Product("Jump Rope", "Sportswear", 14.99, 100));
        productRepository.save(new Product("Basketball", "Sportswear", 29.99, 40));
        productRepository.save(new Product("Soccer Ball", "Sportswear", 24.99, 50));
        productRepository.save(new Product("Tennis Racket", "Sportswear", 89.99, 25));
        productRepository.save(new Product("Skateboa", "Sportswear", 69.99, 35));
        productRepository.save(new Product("Bicycle", "Sportswear", 299.99, 15));
        productRepository.save(new Product("Helmet", "Sportswear", 49.99, 45));
        productRepository.save(new Product("Gloves", "Sportswear", 14.99, 100));
        productRepository.save(new Product("Tent", "Sportswear", 149.99, 20));
        productRepository.save(new Product("Sleeping Bag", "Sportswear", 79.99, 30));
        productRepository.save(new Product("Camping Stove", "Sportswear", 34.99, 25));
        productRepository.save(new Product("Flashlight", "Electronics", 19.99, 75));
    }
}
