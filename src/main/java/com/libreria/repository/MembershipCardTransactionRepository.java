package com.libreria.repository;

import com.libreria.model.MembershipCardTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipCardTransactionRepository extends JpaRepository<MembershipCardTransaction, Integer> {
}
