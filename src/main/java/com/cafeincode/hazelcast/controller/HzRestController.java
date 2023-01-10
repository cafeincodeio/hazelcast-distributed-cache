package com.cafeincode.hazelcast.controller;

import com.cafeincode.hazelcast.constant.Constant;
import com.cafeincode.hazelcast.jpa.Product;
import com.cafeincode.hazelcast.service.ProductService;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hungtv27
 */

@RestController
@RequestMapping("/products")
public class HzRestController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getListProducts() {
        return productService.getProductByStatus(Constant.ACTIVE);
    }

    @PostMapping
    public Product createProduct() {
        return productService.createProduct();
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        productService.deleteProduct(productId);
        return "Delete successfully";
    }
}
