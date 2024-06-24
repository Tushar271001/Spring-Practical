package com.maven.controller;

import com.maven.entities.Order;
import com.maven.entities.Products;
import com.maven.entities.User;
import com.maven.services.Impl.UserServiceImpl;
import com.maven.services.OrderService;
import com.maven.services.ProductService;
import com.maven.services.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class UserController {
    @Autowired
    private OrderService  orderService;
    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

   public User addUser(User user){
       userService.addUser(user);
       return  user;
   }
   public Products addProduct(Products products){
       productService.addProduct(products);
       return products;
   }
   public Order addOrder(Order order){
       orderService.addOrder(order);
       return order;
   }
   public User selectUser(){
       User user=new User();
       user.setUserID(1L);
       User user1 = userService.selectUser(user);
       return user1;
   }
   public Products selectProduct(){
       Products product =new Products();
       product.setProductID(1L);
       Products products=productService.selectProduct(product);
       return products;
   }
}
