package com.spring_data.formation.service;

import com.spring_data.formation.model.Category;
import com.spring_data.formation.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Iterable<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
