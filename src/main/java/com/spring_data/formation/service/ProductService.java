package com.spring_data.formation.service;

import com.spring_data.formation.model.Product;
import com.spring_data.formation.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getOneProduct(Integer productId) {
        return productRepository.findById(productId);
    }

}
