package com.emiyaconsulting.demo.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {
    /**
     * @return ResponseEntity
     */
    // TODO: query param, route param
    @RequestMapping(value = "/products")
    public ResponseEntity<ArrayList<Product>> getProducts() {
        ProductRepository repo = new ProductRepository();
        return new ResponseEntity<>(repo.getProducts(), HttpStatus.OK);
    }
}
