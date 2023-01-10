package com.cafeincode.hazelcast.service.impl;

import com.cafeincode.hazelcast.constant.Constant;
import com.cafeincode.hazelcast.jpa.Product;
import com.cafeincode.hazelcast.repository.ProductRepo;
import com.cafeincode.hazelcast.service.ProductService;
import net.bytebuddy.utility.RandomString;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

    private final String cacheName = "hzProducts";

    @Resource
    private ProductRepo productRepo;

    @Override
    @Cacheable(value = cacheName)
    @Transactional(readOnly = true)
    public List<Product> getProductByStatus(Integer status) {
        return productRepo.getProductByStatus(status);
    }

    @Override
    @CacheEvict(value = cacheName, allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public Product createProduct() {
        Product product = Product.builder()
                .name(RandomString.make(12))
                .code(RandomString.make(8))
                .createdBy("hungtv27")
                .price(new BigDecimal(1000))
                .createdDate(new Date())
                .lastUpdated(new Date())
                .status(Constant.ACTIVE)
                .build();
        return productRepo.save(product);
    }

    @Override
    @CacheEvict(value = cacheName, allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public void deleteProduct(Long id) {
        Optional<Product> product = productRepo.findById(id);
        product.ifPresent(value -> productRepo.deleteById(value.getId()));
    }
}
