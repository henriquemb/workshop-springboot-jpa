package com.github.henriquemb.workshopspringbootjpa.resources;

import com.github.henriquemb.workshopspringbootjpa.entities.Category;
import com.github.henriquemb.workshopspringbootjpa.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Resource
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category usr = service.findById(id);

        return ResponseEntity.ok().body(usr);
    }
}
