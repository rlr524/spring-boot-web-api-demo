package com.emiyaconsulting.demo.product;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<Product>();
        this.products.add(new Product("tomato"));
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }
}
