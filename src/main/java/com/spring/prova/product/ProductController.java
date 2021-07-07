package com.spring.prova.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("{enterpriseId}")
    public ResponseEntity<Product> save(@RequestBody Product product, @PathVariable("enterpriseId") Long enterpriseId){
        Product product1 = productService.save(enterpriseId, product);

        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @GetMapping("{enterpriseId}")
    public ResponseEntity<List<Product>> findByEnterprise(@PathVariable("enterpriseId") Long enterpriseId){

        List<Product> products = productService.findByEnterprise(enterpriseId);

        return ResponseEntity.ok(products);
    }
}
