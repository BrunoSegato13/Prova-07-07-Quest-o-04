package com.spring.prova.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    public List<Enterprise> findAll(){
        return enterpriseRepository.findAll();
    }

    public Enterprise findById(Long enterpriseId){
        Enterprise enterprise = (enterpriseRepository.findById(enterpriseId)
                .orElseThrow(()-> new RuntimeException("Enterprise not found")));
        return enterprise;
    }

    public Enterprise save(Enterprise enterprise){
        return enterpriseRepository.save(enterprise);
    }
}
