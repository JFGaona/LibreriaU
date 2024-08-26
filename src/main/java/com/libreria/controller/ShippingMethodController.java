package com.libreria.controller;

import com.libreria.model.ShippingMethod;
import com.libreria.service.ShippingMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipping-methods")
public class ShippingMethodController {

    @Autowired
    private ShippingMethodService shippingMethodService;

    @GetMapping
    public List<ShippingMethod> getAllShippingMethods() {
        return shippingMethodService.getAllShippingMethods();
    }

    @GetMapping("/{id}")
    public ShippingMethod getShippingMethodById(@PathVariable int id) {
        return shippingMethodService.getShippingMethodById(id);
    }

    @PostMapping
    public ShippingMethod createShippingMethod(@RequestBody ShippingMethod shippingMethod) {
        return shippingMethodService.saveShippingMethod(shippingMethod);
    }

    @DeleteMapping("/{id}")
    public void deleteShippingMethod(@PathVariable int id) {
        shippingMethodService.deleteShippingMethod(id);
    }
}
