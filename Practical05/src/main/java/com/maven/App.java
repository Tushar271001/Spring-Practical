package com.maven;

import com.maven.configuration.SpringConfig;
import com.maven.controller.UserController;
import com.maven.entities.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Scanner x =new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("userController", UserController.class);
        //-------add new user----//
//                User user=new User();
//        user.setUserName("Kedar Padalkar");
//        user.setUserCity("Pune ");
//        user.setUserContact("9730331804");
//        user.setUserEmailId("kedar@gmail.com");
//        user.setUserState("Maharashtra");
//        user.setUserPassword("04092002");
//        userController.addUser(user);


        //-------update user-----//
//        User user =new User();
//        user.setUserName("Sanket Ilkae ");
//        user.setUserCity("Mumbai");
//        user.setUserContact("7057891106");
//        user.setUserEmailId("sanket@gmail.com");
//        user.setUserPassword("15032001");
//        user.setUserState("Maharashtra");
//        user.setUserID(1l);
//        userController.updateUser(user);

        //---delete user----//
//        User user=new User();
//        user.setUserID(1l);
//        userController.deleteUser(user);

        //------select single user ----//
//        User user=new User();
//        user.setUserID(2L);
//        userController.selectUser(user);

        //------select all users ----//
        User user=new User();
        userController.selectAllUser();
//        int ch;
//        User user= new User();
//
//        System.out.println("1.Add User");
//        System.out.println("2.Update User");
//        System.out.println("3.Delete User");
//        System.out.println("enter your choice ");
//        ch=x.nextInt();
//
//        switch (ch){
//            case 1 :userController.addUser(user);
//                    break;
//            case 2:userController.updateUser(user);
//                    break;
//            case 3:userController.deleteUser(user);
//                    break;
//            default:
//                System.out.println("Invalid choice");
//
//        }
    }
}
