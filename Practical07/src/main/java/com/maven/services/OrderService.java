package com.maven.services;

import com.maven.entities.Order;
import com.maven.entities.User;

import java.io.Serializable;
import java.util.List;

public interface OrderService {

  Serializable addOrder(Order order);
}
