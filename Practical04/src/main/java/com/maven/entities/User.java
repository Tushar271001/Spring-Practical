package com.maven.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component

public class User {
    private Long userID;
    private String userName;
    private String userContact;
    private String userCity;
}
