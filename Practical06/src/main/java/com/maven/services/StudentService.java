package com.maven.services;

import com.maven.entities.Student;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public interface StudentService {
    Serializable addStudent (Student student);

    Student selectStudent (Student student);


}
