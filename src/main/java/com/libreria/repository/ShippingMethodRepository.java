package com.libreria.repository;

import com.libreria.model.ShippingMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingMethodRepository extends JpaRepository<ShippingMethod, Integer> {
}
