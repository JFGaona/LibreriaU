package com.libreria.service;

import com.libreria.model.ShippingAddress;
import com.libreria.repository.ShippingAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingAddressService {

    @Autowired
    private ShippingAddressRepository shippingAddressRepository;

    public List<ShippingAddress> getAllShippingAddresses() {
        return shippingAddressRepository.findAll();
    }

    public ShippingAddress getShippingAddressById(int id) {
        return shippingAddressRepository.findById(id).orElse(null);
    }

    public ShippingAddress saveShippingAddress(ShippingAddress shippingAddress) {
        return shippingAddressRepository.save(shippingAddress);
    }

    public void deleteShippingAddress(int id) {
        shippingAddressRepository.deleteById(id);
    }
}
