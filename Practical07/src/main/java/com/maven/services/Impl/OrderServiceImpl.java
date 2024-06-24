package com.maven.services.Impl;

import com.maven.entities.Order;
import com.maven.entities.Products;
import com.maven.entities.User;
import com.maven.services.OrderService;
import lombok.Data;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Data
@Component
public class OrderServiceImpl implements OrderService {
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public Serializable addOrder(Order order) {
        return hibernateTemplate.save(order);
    }
}
