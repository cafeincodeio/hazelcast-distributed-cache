package com.cafeincode.hazelcast.repository;

import com.cafeincode.hazelcast.jpa.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "productRepo")
public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> getProductByStatus(Integer status);
}
