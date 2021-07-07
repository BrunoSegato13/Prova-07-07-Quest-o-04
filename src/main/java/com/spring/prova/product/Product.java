package com.spring.prova.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.prova.enterprise.Enterprise;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private Double price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "enterpriseId", nullable = false)
    private Enterprise enterprise;
}
