package com.ciclo3.sprint_3.repositories;

import com.ciclo3.sprint_3.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
