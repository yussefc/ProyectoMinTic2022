package com.ciclo3.sprint_3.repositories;

import com.ciclo3.sprint_3.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
