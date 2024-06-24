package com.maven.configuration;

import com.maven.entities.Order;
import com.maven.entities.Products;
import com.maven.entities.User;
import com.maven.services.Impl.OrderServiceImpl;
import com.maven.services.Impl.ProductServiceImpl;
import com.maven.services.Impl.UserServiceImpl;
import com.maven.services.OrderService;
import com.maven.services.ProductService;
import com.maven.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;
@Configuration
@ComponentScan(basePackages = {"com.maven"})
@EnableTransactionManagement
public class SpringConfig {
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/hibernate");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
    @Bean
    public Properties getHibernateProperties(){
        Properties p = new Properties();
        p.setProperty("hibernate.hbm2ddl.auto","update");
        p.setProperty("hibernate.show_sql", "true");
        p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        return p;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        sessionFactory.setAnnotatedClasses(Order.class, Products.class, User.class);
        sessionFactory.setHibernateProperties(getHibernateProperties());
        return sessionFactory;
    }
    @Bean
    public HibernateTemplate getHibernateTemplate() {
        HibernateTemplate hibernateTemplate = new HibernateTemplate();
        hibernateTemplate.setSessionFactory(getSessionFactory().getObject());
        hibernateTemplate.setCheckWriteOperations(false);
        return hibernateTemplate;
    }

    @Bean
    public HibernateTransactionManager transactionManager(){
        HibernateTransactionManager htm = new HibernateTransactionManager();
        htm.setSessionFactory(getSessionFactory().getObject());
        return htm;
    }

    @Bean("productService")
     public ProductService productService(){
        ProductServiceImpl productService=new ProductServiceImpl();
        productService.setHibernateTemplate(getHibernateTemplate());
        return productService;
    }
    @Bean("userService")
    public UserService userService(){
        UserServiceImpl userService=new UserServiceImpl();
        userService.setHibernateTemplatel(getHibernateTemplate());
        return userService;
    }
    @Bean("orderService")
    public OrderService orderService(){
        OrderServiceImpl orderService=new OrderServiceImpl();
        orderService.setHibernateTemplate(getHibernateTemplate());
        return orderService;
    }

}
