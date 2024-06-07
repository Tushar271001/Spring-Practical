package com.maven.entities;

import lombok.*;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Setter
@Getter
@ToString


@Component
public class Order {
    private Long orderId;
//    private Customer customer;

    private Product product;

}
