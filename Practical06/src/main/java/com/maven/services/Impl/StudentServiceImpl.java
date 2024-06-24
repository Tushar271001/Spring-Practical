package com.maven.services.Impl;

import com.maven.entities.Address;
import com.maven.entities.Student;
import com.maven.services.StudentService;
import lombok.Data;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Component
public class StudentServiceImpl implements StudentService {
   private HibernateTemplate hibernateTemplate;

   @Override
   public Serializable addStudent(Student student) {
      return hibernateTemplate.save(student);
   }

   @Override
   public Student selectStudent(Student student) {
      return hibernateTemplate.get(Student.class, student.getStudentID());

   }


}
