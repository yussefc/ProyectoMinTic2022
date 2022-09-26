package com.ciclo3.sprint_3.controller;

import com.ciclo3.sprint_3.entities.Enterprise;
import com.ciclo3.sprint_3.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
    @Autowired
    private EnterpriseService enterpriseService;
    @GetMapping
    public List<Enterprise>listar(){
        return enterpriseService.listar();
    }
}
