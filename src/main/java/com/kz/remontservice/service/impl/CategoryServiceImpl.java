package com.kz.remontservice.service.impl;

import com.kz.remontservice.exception.RemontException;
import com.kz.remontservice.model.entity.Category;
import com.kz.remontservice.repository.CategoryRepository;
import com.kz.remontservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        Optional<Category> optCategory = categoryRepository.findById(id);
        if (optCategory.isPresent())
            return optCategory.get();

        throw new RemontException("Category not found");
    }
}
