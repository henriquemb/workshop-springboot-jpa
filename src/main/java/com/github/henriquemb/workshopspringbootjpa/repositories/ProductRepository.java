package com.github.henriquemb.workshopspringbootjpa.repositories;

import com.github.henriquemb.workshopspringbootjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
