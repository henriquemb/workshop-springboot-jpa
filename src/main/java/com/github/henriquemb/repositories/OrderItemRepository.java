package com.github.henriquemb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.henriquemb.entities.OrderItem;
import com.github.henriquemb.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
