package com.maven.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Setter
@Getter
@NoArgsConstructor
@ToString
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
    @ToString.Exclude //to stop recursion
    private Student student;

}
