package com.maven.entities;


import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Component
@Data
@Entity                                                              //USED TO DECLARE ATTRIBUTES OF TABLE
@Table(name = "userdetails")                                        //USED TO GIVE SPEIFIC NAME TO TABLE
public class User {
    //@Id                                                              // USED TO MAKE CLOUMN PRIMARY
    // @CLOUMN                                                        // USED TO ADD EXTRA INFORMATION ABOUT THE CLOUMN
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)             //USED TO MAKE CLOUMN AUTOINCREMENT
    private Long userID;
    private String userName;
    @Column(length = 10)
    private String userContact;
    private String userState;
    private String userCity;
    @Column(unique = true)
    private String userEmailId;
    @Column(length = 8,unique = true)
    private String userPassword;
}
