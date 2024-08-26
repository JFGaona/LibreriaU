package com.libreria.service;

import com.libreria.model.TransactionShipping;
import com.libreria.repository.TransactionShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionShippingService {

    @Autowired
    private TransactionShippingRepository transactionShippingRepository;

    public List<TransactionShipping> getAllTransactionShippings() {
        return transactionShippingRepository.findAll();
    }

    public TransactionShipping getTransactionShippingById(int id) {
        return transactionShippingRepository.findById(id).orElse(null);
    }

    public TransactionShipping saveTransactionShipping(TransactionShipping transactionShipping) {
        return transactionShippingRepository.save(transactionShipping);
    }

    public void deleteTransactionShipping(int id) {
        transactionShippingRepository.deleteById(id);
    }
}
