package com.maven;

import com.maven.configuration.SpringConfig;
import com.maven.controller.UserController;
import com.maven.entites.User;
import com.maven.repositories.UserRepositories;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserRepositories userRepositories = context.getBean("userRepositories", UserRepositories.class);
//        User user = userRepositories.insertUser();
//
//
//    }
public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Scanner x=new Scanner(System.in);
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//    User user = context.getBean("user", User.class);
    UserController userController = context.getBean("userController", UserController.class);
//to insert user in table using abstraction
    //    User user = userController.adduser();
//    System.out.println(user);

//    to print all table data
//    List<User> allUsers = userController.getAllUsers();
//    allUsers.forEach(System.out::println);

//    to delete data by id from table
//     userController.deleteUser();

//    to update user data
//    User user = userController.updateUser();
//    System.out.println(user);
    int ch;

    System.out.println("1.Add User");
    System.out.println("2.Get User");
    System.out.println("3.Delete User");
    System.out.println("4.Update User");
    System.out.println("enter your choice ");
    ch=x.nextInt();
        switch (ch) {
            case 1:
                int i=0;
                while(i==0){
                User user = new User();
                System.out.println("Enter User ID");
                user.setUserId(x.nextLong());
                x.nextLine();
                System.out.println("Enter User Name");
                user.setUsername(x.nextLine());
                System.out.println("Enter User City");
                user.setUserCity(x.nextLine());
                System.out.println("Enter User Contact");
                user.setUserContact(x.nextLine());

                boolean b = userController.isUserExits(user);
                if (b) {
                    System.out.println("Users Exits");
                    System.out.println("Enter New User");
                } else if (b==false) {
                    User u = userController.adduser(user);
                    System.out.println(user);
                    if (u != null) {
                        i = 1;
                    }
                } else {
                    break;
                }
        }
                break;
            case 2:
                List<User> allUsers = userController.getAllUsers();
                allUsers.forEach(System.out::println);
                break;
            case 3:
                userController.deleteUser();
                break;

            case 4:
                userController.updateUser();
                break;
            default:
                System.out.println("Enter Valid Choice");


        }
    }
}

