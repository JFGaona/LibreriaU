package com.libreria.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ShippingMethods")
public class ShippingMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shippingMethodID;

    @Column(name = "ShippingMethodName", nullable = false, unique = true)
    private String shippingMethodName;

    @Column(name = "DeliveryTimeDays", nullable = false)
    private int deliveryTimeDays;

    @Column(name = "ShippingCost", nullable = false)
    private BigDecimal shippingCost;

    public int getShippingMethodID() {
        return shippingMethodID;
    }

    public void setShippingMethodID(int shippingMethodID) {
        this.shippingMethodID = shippingMethodID;
    }

    public String getShippingMethodName() {
        return shippingMethodName;
    }

    public void setShippingMethodName(String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    public int getDeliveryTimeDays() {
        return deliveryTimeDays;
    }

    public void setDeliveryTimeDays(int deliveryTimeDays) {
        this.deliveryTimeDays = deliveryTimeDays;
    }

    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(BigDecimal shippingCost) {
        this.shippingCost = shippingCost;
    }
}
