package com.kz.remontservice.service;

import com.kz.remontservice.model.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    Category getCategoryById(Long id) ;

}
