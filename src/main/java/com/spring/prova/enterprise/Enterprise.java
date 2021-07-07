package com.spring.prova.enterprise;

import com.spring.prova.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enterpriseId;
    private String name;
    private String cnpj;
    private String email;

    @OneToMany(mappedBy = "enterprise")
    private List<Product> products;
}
