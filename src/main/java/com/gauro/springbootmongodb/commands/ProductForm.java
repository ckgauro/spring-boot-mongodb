package com.gauro.springbootmongodb.commands;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Chandra
 */
@Getter
@Setter
public class ProductForm {
    private String id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}
