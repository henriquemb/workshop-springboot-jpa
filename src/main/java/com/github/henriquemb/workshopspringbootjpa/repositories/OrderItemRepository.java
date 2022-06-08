package com.github.henriquemb.workshopspringbootjpa.repositories;

import com.github.henriquemb.workshopspringbootjpa.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
