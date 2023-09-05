package com.educandoweb.course.services.impl;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.ProductRepository;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    @Override
    public List<Product> listProduct() {
        return repository.findAll().stream().toList();
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> product =  repository.findById(id);
        return product.get();
    }

}
