package com.libreria.controller;

import com.libreria.model.PaymentMethod;
import com.libreria.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment-methods")
public class PaymentMethodController {

    @Autowired
    private PaymentMethodService paymentMethodService;

    @GetMapping
    public List<PaymentMethod> getAllPaymentMethods() {
        return paymentMethodService.getAllPaymentMethods();
    }

    @GetMapping("/{id}")
    public PaymentMethod getPaymentMethodById(@PathVariable int id) {
        return paymentMethodService.getPaymentMethodById(id);
    }

    @PostMapping
    public PaymentMethod createPaymentMethod(@RequestBody PaymentMethod paymentMethod) {
        return paymentMethodService.savePaymentMethod(paymentMethod);
    }

    @DeleteMapping("/{id}")
    public void deletePaymentMethod(@PathVariable int id) {
        paymentMethodService.deletePaymentMethod(id);
    }
}
