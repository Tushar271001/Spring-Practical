package com.maven.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@Table(name = "studentAddress")
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressID;
    private String city;
    private String state;
    private String country;
    private String pinCode;
    @OneToOne
    private Student student;

}
