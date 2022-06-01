package com.github.henriquemb.workshopspringbootjpa.services;

import com.github.henriquemb.workshopspringbootjpa.entities.Product;
import com.github.henriquemb.workshopspringbootjpa.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Resource
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);

        return obj.orElse(null);
    }
}
