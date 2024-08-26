package com.libreria.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TransactionDetails")
public class TransactionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionDetailID;

    @ManyToOne
    @JoinColumn(name = "TransactionID", nullable = false)
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "BookID", nullable = false)
    private Book book;

    @Column(name = "Quantity", nullable = false)
    private int quantity;

    @Column(name = "PriceAtPurchase", nullable = false)
    private BigDecimal priceAtPurchase;

    public int getTransactionDetailID() {
        return transactionDetailID;
    }

    public void setTransactionDetailID(int transactionDetailID) {
        this.transactionDetailID = transactionDetailID;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPriceAtPurchase() {
        return priceAtPurchase;
    }

    public void setPriceAtPurchase(BigDecimal priceAtPurchase) {
        this.priceAtPurchase = priceAtPurchase;
    }
}
