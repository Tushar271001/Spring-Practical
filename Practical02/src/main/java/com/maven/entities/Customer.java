package com.maven.entities;

import lombok.*;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Setter
@Getter
@ToString

@Component
public class Customer {
     private Long customerId;
     private String customerName;
     private String customerCity;
     private String customerState;
     private String customerPincode;
     private Order order;
//     private Product product;


}
