package com.maven;

import com.maven.configuration.SpringConfig;
import com.maven.controller.UserController;
import com.maven.entities.Order;
import com.maven.entities.Products;
import com.maven.entities.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("userController", UserController.class);
        User user=new User();
        user.setUserName("Tushar Yadav");
        user.setUserContact("9595143472");
        user.setUserEmail("tytushar27@gmail.com");
        user.setUserAddress("Kolhapur");
        userController.addUser(user);
          //------add product----//
        Products product=new Products();
        product.setProductName(" OnePlus");
        product.setProductPrice("45000");
        product.setProductQuantity("1");
        userController.addProduct(product);
        //------add order and set user----//
        Order order=new Order();
        User user2=new User();
        User user1=userController.selectUser();
        order.setUser(user1);
        Products products=new Products();
        Products product1=userController.selectProduct();
        List<Products> products2 =new ArrayList<>();
        products2.add(product1);
        order.setProducts(products2);
        userController.addOrder(order);
//
//        System.out.println(userController.selectUser());

        //-----select all users from database----//
//        User user=new User();
//        System.out.println(userController.selectAllUser(user));

        //----delete user ----//

//        userController.deleteUser();

    }
}
