package com.spring.prova.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @GetMapping
    public ResponseEntity<List<Enterprise>> findAll(){
        List<Enterprise> enterprises = enterpriseService.findAll();
        return ResponseEntity.ok(enterprises);
    }

    @GetMapping("{enterpriseId}")
    public ResponseEntity<Enterprise> findById(@PathVariable("enterpriseId") Long enterpriseId){
        return ResponseEntity.ok(enterpriseService.findById(enterpriseId));
    }

    @PostMapping
    public ResponseEntity<Enterprise> save(@RequestBody Enterprise enterprise){
        return new ResponseEntity<Enterprise>(enterpriseService.save(enterprise), HttpStatus.CREATED);
    }
}
