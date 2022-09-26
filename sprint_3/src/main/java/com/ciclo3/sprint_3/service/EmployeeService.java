package com.ciclo3.sprint_3.service;

import com.ciclo3.sprint_3.entities.Employee;
import com.ciclo3.sprint_3.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee insertar(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee actualizar(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> listar(){
        return employeeRepository.findAll();
    }
    public void eliminar(Employee employee){
        employeeRepository.delete(employee);
    }
}
