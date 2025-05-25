package com.hms.HotelManagementSystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    private Payment payment;
    @NotNull(message = "Status cannot be null")
    private String status;
    private LocalDateTime checkIn;
    private LocalDateTime checkout;
    private LocalDateTime actualCheckOut;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;

    public Booking() {
    }

    public Booking(Reservation reservation, Payment payment, @NotNull(message = "Status cannot be null") String status, LocalDateTime checkIn, LocalDateTime checkout, LocalDateTime actualCheckOut, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.reservation = reservation;
        this.payment = payment;
        this.status = status;
        this.checkIn = checkIn;
        this.checkout = checkout;
        this.actualCheckOut = actualCheckOut;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    public LocalDateTime getActualCheckOut() {
        return actualCheckOut;
    }

    public void setActualCheckOut(LocalDateTime actualCheckOut) {
        this.actualCheckOut = actualCheckOut;
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
