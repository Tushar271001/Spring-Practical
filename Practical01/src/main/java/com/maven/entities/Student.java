package com.maven.entities;

import lombok.*;

@Data
public class Student  {
    private int id,age;
    private  String firstName,lastName,email,contact;

    private Address address;


}
