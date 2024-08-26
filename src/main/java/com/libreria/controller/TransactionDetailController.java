package com.libreria.controller;

import com.libreria.model.TransactionDetail;
import com.libreria.service.TransactionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction-details")
public class TransactionDetailController {

    @Autowired
    private TransactionDetailService transactionDetailService;

    @GetMapping
    public List<TransactionDetail> getAllTransactionDetails() {
        return transactionDetailService.getAllTransactionDetails();
    }

    @GetMapping("/{id}")
    public TransactionDetail getTransactionDetailById(@PathVariable int id) {
        return transactionDetailService.getTransactionDetailById(id);
    }

    @PostMapping
    public TransactionDetail createTransactionDetail(@RequestBody TransactionDetail transactionDetail) {
        return transactionDetailService.saveTransactionDetail(transactionDetail);
    }

    @DeleteMapping("/{id}")
    public void deleteTransactionDetail(@PathVariable int id) {
        transactionDetailService.deleteTransactionDetail(id);
    }
}
