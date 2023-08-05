package com.github.henriquemb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.henriquemb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
