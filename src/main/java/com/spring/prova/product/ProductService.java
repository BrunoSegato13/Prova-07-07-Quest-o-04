package com.spring.prova.product;

import com.spring.prova.enterprise.Enterprise;
import com.spring.prova.enterprise.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private EnterpriseService enterpriseService;

    public Product save(Long enterpriseId, Product product){

        Enterprise enterprise = enterpriseService.findById(enterpriseId);

        product.setEnterprise(enterprise);

        return productRepository.save(product);
    }

    public List<Product> findByEnterprise(Long enterpriseId){

        Enterprise enterprise = enterpriseService.findById(enterpriseId);

        List<Product> products = productRepository.findByEnterprise(enterprise);

        return products;
    }
}
