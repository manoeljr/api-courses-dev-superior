package com.educandoweb.course.services.impl;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.services.CategoryService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.repository = categoryRepository;
    }

    @Override
    public List<Category> listCategory() {
        return repository.findAll().stream().toList();
    }

    @Override
    public Category findById(Long id) {
        Optional<Category> category =  repository.findById(id);
        return category.get();
    }

}
