package com.libreria.controller;

import com.libreria.model.UserCoupon;
import com.libreria.service.UserCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-coupons")
public class UserCouponController {

    @Autowired
    private UserCouponService userCouponService;

    @GetMapping
    public List<UserCoupon> getAllUserCoupons() {
        return userCouponService.getAllUserCoupons();
    }

    @GetMapping("/{id}")
    public UserCoupon getUserCouponById(@PathVariable int id) {
        return userCouponService.getUserCouponById(id);
    }

    @PostMapping
    public UserCoupon createUserCoupon(@RequestBody UserCoupon userCoupon) {
        return userCouponService.saveUserCoupon(userCoupon);
    }

    @DeleteMapping("/{id}")
    public void deleteUserCoupon(@PathVariable int id) {
        userCouponService.deleteUserCoupon(id);
    }
}
