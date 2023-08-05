package com.github.henriquemb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.henriquemb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
