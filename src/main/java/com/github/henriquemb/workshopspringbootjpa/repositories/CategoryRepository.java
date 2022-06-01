package com.github.henriquemb.workshopspringbootjpa.repositories;

import com.github.henriquemb.workshopspringbootjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
