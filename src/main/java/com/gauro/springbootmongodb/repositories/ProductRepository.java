package com.gauro.springbootmongodb.repositories;

import com.gauro.springbootmongodb.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chandra
 */
public interface ProductRepository extends CrudRepository<Product, String> {
}
