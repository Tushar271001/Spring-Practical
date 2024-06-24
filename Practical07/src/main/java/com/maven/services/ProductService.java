package com.maven.services;

import com.maven.entities.Products;

import java.io.Serializable;

public interface ProductService {
    Serializable addProduct(Products products);

    Products selectProduct (Products products);
}
