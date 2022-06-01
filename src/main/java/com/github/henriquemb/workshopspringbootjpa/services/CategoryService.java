package com.github.henriquemb.workshopspringbootjpa.services;

import com.github.henriquemb.workshopspringbootjpa.entities.Category;
import com.github.henriquemb.workshopspringbootjpa.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Resource
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);

        return obj.orElse(null);
    }
}
