package com.github.henriquemb.workshopspringbootjpa.resources;

import com.github.henriquemb.workshopspringbootjpa.entities.Product;
import com.github.henriquemb.workshopspringbootjpa.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    @Resource
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product usr = service.findById(id);

        return ResponseEntity.ok().body(usr);
    }
}
