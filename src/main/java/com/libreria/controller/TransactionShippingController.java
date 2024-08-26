package com.libreria.controller;

import com.libreria.model.TransactionShipping;
import com.libreria.service.TransactionShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction-shipping")
public class TransactionShippingController {

    @Autowired
    private TransactionShippingService transactionShippingService;

    @GetMapping
    public List<TransactionShipping> getAllTransactionShippings() {
        return transactionShippingService.getAllTransactionShippings();
    }

    @GetMapping("/{id}")
    public TransactionShipping getTransactionShippingById(@PathVariable int id) {
        return transactionShippingService.getTransactionShippingById(id);
    }

    @PostMapping
    public TransactionShipping createTransactionShipping(@RequestBody TransactionShipping transactionShipping) {
        return transactionShippingService.saveTransactionShipping(transactionShipping);
    }

    @DeleteMapping("/{id}")
    public void deleteTransactionShipping(@PathVariable int id) {
        transactionShippingService.deleteTransactionShipping(id);
    }
}
