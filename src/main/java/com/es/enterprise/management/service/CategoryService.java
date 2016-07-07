package com.es.enterprise.management.service;

import com.es.enterprise.management.domain.Category;

import com.es.enterprise.management.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Object findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        return categoryRepository.findOne(id);
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }
}
