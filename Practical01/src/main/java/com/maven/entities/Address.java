
package com.maven.entities;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
public class Address {

    String city;
    String state;
    String country;
    String pinCode;

    @Autowired
    public void settingValues(){
        setCity("Kolhapur");
        setState("Maharashtra");
        setCountry("India");
        setPinCode("416234");

    }

}
