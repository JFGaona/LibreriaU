package com.libreria.service;

import com.libreria.model.UserCoupon;
import com.libreria.repository.UserCouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCouponService {

    @Autowired
    private UserCouponRepository userCouponRepository;

    public List<UserCoupon> getAllUserCoupons() {
        return userCouponRepository.findAll();
    }

    public UserCoupon getUserCouponById(int id) {
        return userCouponRepository.findById(id).orElse(null);
    }

    public UserCoupon saveUserCoupon(UserCoupon userCoupon) {
        return userCouponRepository.save(userCoupon);
    }

    public void deleteUserCoupon(int id) {
        userCouponRepository.deleteById(id);
    }
}
