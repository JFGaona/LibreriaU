package com.libreria.service;

import com.libreria.model.TransactionDetail;
import com.libreria.repository.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionDetailService {

    @Autowired
    private TransactionDetailRepository transactionDetailRepository;

    public List<TransactionDetail> getAllTransactionDetails() {
        return transactionDetailRepository.findAll();
    }

    public TransactionDetail getTransactionDetailById(int id) {
        return transactionDetailRepository.findById(id).orElse(null);
    }

    public TransactionDetail saveTransactionDetail(TransactionDetail transactionDetail) {
        return transactionDetailRepository.save(transactionDetail);
    }

    public void deleteTransactionDetail(int id) {
        transactionDetailRepository.deleteById(id);
    }
}
