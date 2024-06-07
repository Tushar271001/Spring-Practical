package com.maven.entites;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    private Long userId;
    private String userName;
    private String userContact;
    private String userCity;

}
