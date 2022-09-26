package com.ciclo3.sprint_3.controller;
//Conexion de la parte web

import com.ciclo3.sprint_3.entities.Employee;
import com.ciclo3.sprint_3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<Employee>listar(){
        return employeeService.listar();
    }
}
