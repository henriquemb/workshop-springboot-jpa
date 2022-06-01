package com.github.henriquemb.workshopspringbootjpa.repositories;

import com.github.henriquemb.workshopspringbootjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
