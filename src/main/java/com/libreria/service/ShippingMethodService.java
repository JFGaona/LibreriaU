package com.libreria.service;

import com.libreria.model.ShippingMethod;
import com.libreria.repository.ShippingMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingMethodService {

    @Autowired
    private ShippingMethodRepository shippingMethodRepository;

    public List<ShippingMethod> getAllShippingMethods() {
        return shippingMethodRepository.findAll();
    }

    public ShippingMethod getShippingMethodById(int id) {
        return shippingMethodRepository.findById(id).orElse(null);
    }

    public ShippingMethod saveShippingMethod(ShippingMethod shippingMethod) {
        return shippingMethodRepository.save(shippingMethod);
    }

    public void deleteShippingMethod(int id) {
        shippingMethodRepository.deleteById(id);
    }
}
