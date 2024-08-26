package com.libreria.controller;

import com.libreria.model.MembershipCardTransaction;
import com.libreria.service.MembershipCardTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/membership-card-transactions")
public class MembershipCardTransactionController {

    @Autowired
    private MembershipCardTransactionService membershipCardTransactionService;

    @GetMapping
    public List<MembershipCardTransaction> getAllMembershipCardTransactions() {
        return membershipCardTransactionService.getAllMembershipCardTransactions();
    }

    @GetMapping("/{id}")
    public MembershipCardTransaction getMembershipCardTransactionById(@PathVariable int id) {
        return membershipCardTransactionService.getMembershipCardTransactionById(id);
    }

    @PostMapping
    public MembershipCardTransaction createMembershipCardTransaction(@RequestBody MembershipCardTransaction transaction) {
        return membershipCardTransactionService.saveMembershipCardTransaction(transaction);
    }

    @DeleteMapping("/{id}")
    public void deleteMembershipCardTransaction(@PathVariable int id) {
        membershipCardTransactionService.deleteMembershipCardTransaction(id);
    }
}
