package com.maven;

import com.maven.configuration.SpringConfig;
import com.maven.controller.UserController;
import com.maven.entities.User;
import lombok.Builder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException {
        Scanner x =new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("userController", UserController.class);
//        userController.addUser();
//        userController.updateUser();
//        userController.deleteUser();
//        System.out.println( userController.selectUser());
//        System.out.println(userController.selectSingleUSer(101));

        int ch;
        User user= new User();

        System.out.println("1.Add User");
        System.out.println("2.Update User");
        System.out.println("3.Delete User");
        System.out.println("4.Get All User");
        System.out.println("5.Get Single User");
        System.out.println("enter your choice ");
        ch=x.nextInt();

        switch (ch){
            case 1:
                    x.nextLine();
                    System.out.println("Enter User Name");
                    user.setUserName(x.nextLine());
                    System.out.println("Enter User City");
                    user.setUserCity(x.nextLine());
                    System.out.println("Enter User Contact");
                    user.setUserContact(x.nextLine());
                    System.out.println(userController.isUserExits(user));
                    if (!userController.isUserExits(user)){
                        System.out.println("USER ALREADY EXITS");
                    }
                    else{
                        System.out.println("NEW USER INSTERTED ");
                        userController.addUser(user);
                    }
                    break;
            case 2: x.nextLine();
                    System.out.println("Enter User Name");
                    user.setUserName(x.nextLine());
                    System.out.println("Enter User City");
                    user.setUserCity(x.nextLine());
                    userController.updateUser(user);
                    break;
            case 3:
                    System.out.println("Enter USer ID to delete");
                    user.setUserID(x.nextLong());
                    System.out.println(userController.deleteUser(user));
                    break;
            case 4: System.out.println( userController.selectUser());
                    break;
            case 5:
                    System.out.println("Enter USer Id ");
                    user.setUserID(x.nextLong());
                    System.out.println(userController.selectSingleUSer(user.getUserID()));
                    break;
            default:
                    System.out.println("Invalid Choice");
        }
    }
}
