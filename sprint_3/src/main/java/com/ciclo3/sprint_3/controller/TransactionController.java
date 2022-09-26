package com.ciclo3.sprint_3.controller;

import com.ciclo3.sprint_3.entities.Transaction;
import com.ciclo3.sprint_3.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @GetMapping
    public List<Transaction>listar(){
        return transactionService.listar();
    }
}
