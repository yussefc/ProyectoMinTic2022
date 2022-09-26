package com.ciclo3.sprint_3.repositories;

import com.ciclo3.sprint_3.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EnterpriseRepository extends JpaRepository<Enterprise, Integer> {
}

