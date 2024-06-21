package com.maven.entities;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@Entity
@Table(name = "studentinfo")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;
    private Long studentAge;
    private  String studentFirstName;
    private  String studentLastName;
    @Column(unique = true)
    private  String studentEMail;
    @Column(length = 10)
    private  String studentContact;

}
