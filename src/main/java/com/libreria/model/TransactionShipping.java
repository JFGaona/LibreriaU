package com.libreria.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TransactionShipping")
public class TransactionShipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionShippingID;

    @ManyToOne
    @JoinColumn(name = "TransactionID", nullable = false)
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "ShippingMethodID", nullable = false)
    private ShippingMethod shippingMethod;

    @Column(name = "TrackingNumber", unique = true)
    private String trackingNumber;

    @Column(name = "ShippingDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date shippingDate;

    @Column(name = "EstimatedDeliveryDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedDeliveryDate;

    public int getTransactionShippingID() {
        return transactionShippingID;
    }

    public void setTransactionShippingID(int transactionShippingID) {
        this.transactionShippingID = transactionShippingID;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
}
