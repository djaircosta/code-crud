package com.ayd.service;

import java.util.List;

import com.ayd.entity.Product;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class ProductService {

    public List<Product> listProduct() {
        return Product.listAll();
    }

    @Transactional
    public Product saveProduct(Product dto) {

        Product product = new Product();

        product.setName(dto.getName());

        product.setStock(dto.getStock());

        product.setPrice(dto.getPrice());

        product.persist();

        return product;

    }
    
    
}
