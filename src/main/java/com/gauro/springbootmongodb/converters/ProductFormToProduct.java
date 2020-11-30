package com.gauro.springbootmongodb.converters;

import com.gauro.springbootmongodb.commands.ProductForm;
import com.gauro.springbootmongodb.domain.Product;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author Chandra
 */
@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {
    @Override
    public Product convert(ProductForm productForm) {
        Product product=new Product();
        if(productForm.getId()!=null && !StringUtils.isEmpty(productForm.getId())){
            product.setId(new ObjectId(productForm.getId()));
        }

        product.setDescription(productForm.getDescription());
        product.setPrice(productForm.getPrice());
        product.setImageUrl(productForm.getImageUrl());
        return product;
    }
}
