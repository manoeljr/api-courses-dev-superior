package com.educandoweb.course.services;

import com.educandoweb.course.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();
    Product findById(Long id);
}
