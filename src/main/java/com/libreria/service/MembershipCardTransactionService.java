package com.libreria.service;

import com.libreria.model.MembershipCardTransaction;
import com.libreria.repository.MembershipCardTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipCardTransactionService {

    @Autowired
    private MembershipCardTransactionRepository membershipCardTransactionRepository;

    public List<MembershipCardTransaction> getAllMembershipCardTransactions() {
        return membershipCardTransactionRepository.findAll();
    }

    public MembershipCardTransaction getMembershipCardTransactionById(int id) {
        return membershipCardTransactionRepository.findById(id).orElse(null);
    }

    public MembershipCardTransaction saveMembershipCardTransaction(MembershipCardTransaction transaction) {
        return membershipCardTransactionRepository.save(transaction);
    }

    public void deleteMembershipCardTransaction(int id) {
        membershipCardTransactionRepository.deleteById(id);
    }
}
