package com.gauro.springbootmongodb.services;

import com.gauro.springbootmongodb.commands.ProductForm;
import com.gauro.springbootmongodb.domain.Product;

import java.util.List;

/**
 * @author Chandra
 */
public interface ProductService {
    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
