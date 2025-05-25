package com.hms.HotelManagementSystem.Model;

import com.hms.HotelManagementSystem.Enum.ReservationStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reservationID;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guestId;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room roomId;
    @NotNull(message = "Check In date cannot be null")
    private LocalDate checkInDate;
    @NotNull(message = "Check Out date cannot be null")
    private LocalDate checkOutDate;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Status cannot be null")
    private ReservationStatus status;
    @Positive
    @Min(1)
    private double totalAmount;
    @NotNull(message = "Username cannot be null")
    @Size(min = 2, max = 15,  message = "Username must have at least 2 characters")
    private String specialRequests;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;

    public Reservation() {
    }


    public Reservation(Guest guestId, Room roomId, @NotNull(message = "Check In date cannot be null") LocalDate checkInDate, @NotNull(message = "Check Out date cannot be null") LocalDate checkOutDate, @NotNull(message = "Status cannot be null") ReservationStatus status, double totalAmount, @NotNull(message = "Username cannot be null") String specialRequests, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.guestId = guestId;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
        this.totalAmount = totalAmount;
        this.specialRequests = specialRequests;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }


    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public Guest getGuestId() {
        return guestId;
    }

    public void setGuestId(Guest guestId) {
        this.guestId = guestId;
    }

    public Room getRoomId() {
        return roomId;
    }

    public void setRoomId(Room roomId) {
        this.roomId = roomId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
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
