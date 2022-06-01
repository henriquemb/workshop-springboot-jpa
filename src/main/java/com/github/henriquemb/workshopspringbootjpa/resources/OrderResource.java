package com.github.henriquemb.workshopspringbootjpa.resources;

import com.github.henriquemb.workshopspringbootjpa.entities.Order;
import com.github.henriquemb.workshopspringbootjpa.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @Resource
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order usr = service.findById(id);

        return ResponseEntity.ok().body(usr);
    }
}
