package com.maven;

import com.maven.entities.Address;
import com.maven.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     Student S = new Student ();
     S.setId(1);
     S.setAge(23);
     S.setFirstName("Tushar");
     S.setLastName("Yadav");
     S.setEmail("tytushar27@gmail.com");
     S.setContact("9595143472");

     Address A=new Address();  //class injected by new keyword

     A.setCountry("India");
     A.setCity("Kolhapur");
     A.setState("Maharashtra");
     A.setPinCode("416234");
     S.setAddress(A);

        System.out.println(S.toString());

//        Address A =new Address();
//        A.setPinCode((short) 416234);     //typecasting,tightlycoupled program,IOC container
//        A.setCity("Kolhapur");
//        A.setState("Maharashtra");
//        A.setCountry("India");

    }



}
