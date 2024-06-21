package com.maven;

import com.maven.configuration.SpringConfig;
import com.maven.controller.StudentController;
import com.maven.entities.Address;
import com.maven.entities.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentController studentController = context.getBean("studentController", StudentController.class);
//        Student student=new Student();
//        Address address=new Address();
//        student.setStudentFirstName(" Sanket");
//        student.setStudentLastName("Ilkae");
//        student.setStudentAge(23L);
//        student.setStudentContact("7057891106");
//        student.setStudentEMail("sanket@gmail.com");
//        address.setStudent(student);
//        address.setCity("Kolhapur");
//        address.setState("Maharashtra");
//        address.setCountry("India");
//        address.setPinCode("416234");
//        studentController.addStudent(student);
//        studentController.addAdress(address);

        Address address=new Address();
        studentController.selectStudent(address);
    }
}
