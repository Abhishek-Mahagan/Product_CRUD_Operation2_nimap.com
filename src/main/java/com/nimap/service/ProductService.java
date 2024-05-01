// ProductService.java
package com.nimap.service;

import com.nimap.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product createProduct(Product product);

    Product getProductById(int id);

    Product updateProduct(int id, Product productDetails);

    void deleteProduct(int id);
}
