package com.educandoweb.course.services;

import com.educandoweb.course.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategory();
    Category findById(Long id);
}
