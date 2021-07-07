package com.spring.prova.product;

import com.spring.prova.enterprise.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByEnterprise(Enterprise enterprise);
}
