package com.github.henriquemb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.henriquemb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
