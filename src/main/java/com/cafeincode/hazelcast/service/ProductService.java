package com.cafeincode.hazelcast.service;

import com.cafeincode.hazelcast.jpa.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByStatus(Integer status);

    Product createProduct();

    void deleteProduct(Long id);
}
