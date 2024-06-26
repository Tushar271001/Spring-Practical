package com.maven.entities;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Data
@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productID;
    private String productName;
    private String productPrice;
    private String productQuantity;
    @ManyToMany(mappedBy = "products", cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private List<Order> order;
}
