package com.hms.HotelManagementSystem.Model;

import com.hms.HotelManagementSystem.Enum.PaymentMethod;
import com.hms.HotelManagementSystem.Enum.PaymentStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking bookingId;
    private double amount;
    private LocalDate paymentDate;
    @NotNull(message = "Method cannot be null")
    @Enumerated(EnumType.STRING)
    private PaymentMethod method;
    @NotNull(message = "Status cannot be null")
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
    private int transactionId;
    private String notes;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;


    public Payment() {
    }

    public Payment(Booking bookingId, double amount, LocalDate paymentDate, @NotNull(message = "Method cannot be null") PaymentMethod method, @NotNull(message = "Status cannot be null") PaymentStatus status, int transactionId, String notes, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.method = method;
        this.status = status;
        this.transactionId = transactionId;
        this.notes = notes;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Booking getBookingId() {
        return bookingId;
    }

    public void setBookingId(Booking bookingId) {
        this.bookingId = bookingId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
