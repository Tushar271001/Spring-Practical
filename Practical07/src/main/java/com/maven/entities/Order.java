package com.maven.entities;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Data
@Table(name = "orders")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;
    @ManyToOne
    @ToString.Exclude
    private User user;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Products> products;

}
