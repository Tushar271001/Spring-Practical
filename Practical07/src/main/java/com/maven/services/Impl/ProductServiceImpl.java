package com.maven.services.Impl;

import com.maven.entities.Products;
import com.maven.services.ProductService;
import lombok.Data;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
public class ProductServiceImpl implements ProductService {
    private HibernateTemplate hibernateTemplate;

    @Override
    public Serializable addProduct(Products products) {
        return hibernateTemplate.save(products);
    }

    @Override
    public Products selectProduct(Products products) {
        return hibernateTemplate.get(Products.class,products.getProductID()) ;
    }
}
