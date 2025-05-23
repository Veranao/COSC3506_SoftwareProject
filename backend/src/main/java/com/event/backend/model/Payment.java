package com.event.backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amountPaid;

    private LocalDate paymentDate;

    private String paymentMethod; // e.g., "Credit Card", "PayPal"

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    // Getters and Setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Double getAmountPaid() { return amountPaid; }

    public void setAmountPaid(Double amountPaid) { this.amountPaid = amountPaid; }

    public LocalDate getPaymentDate() { return paymentDate; }

    public void setPaymentDate(LocalDate paymentDate) { this.paymentDate = paymentDate; }

    public String getPaymentMethod() { return paymentMethod; }

    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public Invoice getInvoice() { return invoice; }

    public void setInvoice(Invoice invoice) { this.invoice = invoice; }
}
