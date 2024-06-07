package com.maven.configuration;

import com.maven.entities.Customer;
import com.maven.entities.Order;
import com.maven.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.maven.entities")
public class SpringConfig {
    @Autowired
    private Customer customer;
    @Autowired
    private Product product;
    @Autowired
    private Order order;
    @Bean
    public Customer  getCustomer(){    //getCustomer bean name
        customer.setCustomerId(101L);
        customer.setCustomerName("Tushar Yadav");
        customer.setCustomerCity("Kolhapur");
        customer.setCustomerState("Maharashtra");
        customer.setCustomerPincode("416234");
        customer.setOrder(order);
//        customer.setProduct(product);
        return customer;
    }
    @Bean
    public Product getProduct(){
        product.setProductId(1001L);
        product.setProductName("Mobile");
        product.setProductPrice(16500.00F);
        product.setProductQuantity(1);
//        product.setOrder(order);
        return product;
    }
    @Bean
    public Order getOrder(){
        order.setOrderId(222L);
        order.setProduct(product);

        return order;

    }
    @Bean
    public Customer check(){

        Customer customer1 = getCustomer();
        Order order1 = getOrder();

        if (customer1.getOrder().getOrderId().equals(order1.getOrderId())){
            return customer1;
        }
        return null;
    }
}
