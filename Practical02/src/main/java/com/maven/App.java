package com.maven;

import com.maven.configuration.SpringConfig;
import com.maven.entities.Customer;
import com.maven.entities.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Order order = context.getBean("order", Order.class);
        Customer check = context.getBean("check", Customer.class);
        System.out.println( check.toString());


//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Customer customer = context.getBean("customer", Customer.class);
//        System.out.println(customer.toString());
    }
}
