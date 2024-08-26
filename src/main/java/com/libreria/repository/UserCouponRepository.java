package com.libreria.repository;

import com.libreria.model.UserCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCouponRepository extends JpaRepository<UserCoupon, Integer> {
}
