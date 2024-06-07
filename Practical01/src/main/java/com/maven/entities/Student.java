package com.maven.entities;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data //used to get method :setter,getter,toString method,noArgConstructor
@Component //used to access properties
public class Student  {
    private int id;
    private int age;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String contact;

    @Autowired  //used to create object automatically
    private Address address;
   @Autowired
    public void settingValues(){
       setId(101);
       setFirstName("Tushar");
       setLastName("Yadav");
       setAge(23);
       setContact("9595143472");
       setEmail("tytushar27@gmail.com");
   }

}
