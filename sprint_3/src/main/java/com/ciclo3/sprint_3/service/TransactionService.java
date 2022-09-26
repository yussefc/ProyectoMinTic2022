package com.ciclo3.sprint_3.service;

import com.ciclo3.sprint_3.entities.Transaction;
import com.ciclo3.sprint_3.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    public Transaction insertar(Transaction transaction){
        return transactionRepository.save(transaction);
    }
    public Transaction actualizar(Transaction transaction){
        return transactionRepository.save(transaction);
    }
    public List<Transaction> listar(){
        return transactionRepository.findAll();
    }
    public void eliminar(Transaction transaction){
        transactionRepository.delete(transaction);
    }
}
