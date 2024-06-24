package com.maven.controller;

import com.maven.entities.Address;
import com.maven.entities.Student;
import com.maven.services.AddressService;
import com.maven.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class StudentController {
    @Autowired
    private StudentService studentService;
   @Autowired
    private AddressService addressService;

    public Student addStudent (Student student){
        studentService.addStudent(student);
        return student;
    }
    public Address addAdress (Address address){
         addressService.addAddress(address);
         return address;
    }

    public Address selectStudent (Address address){
        address.setAddressID(1L);
        addressService.selectAddress(address);
        return address;
    }
    public Student selectStudent (){
        Student student=new Student();
        student.setStudentID(1L);
        Student student1 = studentService.selectStudent(student);
        return student1;
    }
}
