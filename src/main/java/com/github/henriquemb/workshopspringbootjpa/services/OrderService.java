package com.github.henriquemb.workshopspringbootjpa.services;

import com.github.henriquemb.workshopspringbootjpa.entities.Order;
import com.github.henriquemb.workshopspringbootjpa.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Resource
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);

        return obj.orElse(null);
    }
}
