package com.libreria.controller;

import com.libreria.model.ShippingAddress;
import com.libreria.service.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipping-addresses")
public class ShippingAddressController {

    @Autowired
    private ShippingAddressService shippingAddressService;

    @GetMapping
    public List<ShippingAddress> getAllShippingAddresses() {
        return shippingAddressService.getAllShippingAddresses();
    }

    @GetMapping("/{id}")
    public ShippingAddress getShippingAddressById(@PathVariable int id) {
        return shippingAddressService.getShippingAddressById(id);
    }

    @PostMapping
    public ShippingAddress createShippingAddress(@RequestBody ShippingAddress shippingAddress) {
        return shippingAddressService.saveShippingAddress(shippingAddress);
    }

    @DeleteMapping("/{id}")
    public void deleteShippingAddress(@PathVariable int id) {
        shippingAddressService.deleteShippingAddress(id);
    }
}
