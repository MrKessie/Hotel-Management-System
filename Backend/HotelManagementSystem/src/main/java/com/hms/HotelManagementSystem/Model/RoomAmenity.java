package com.hms.HotelManagementSystem.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class RoomAmenity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roomAmenityId;
    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
    @ManyToOne
    @JoinColumn(name = "amenity_id")
    private Amenity amenity;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;

    public RoomAmenity() {
    }

    public RoomAmenity(RoomType roomType, Amenity amenity, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.roomType = roomType;
        this.amenity = amenity;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getRoomAmenityId() {
        return roomAmenityId;
    }

    public void setRoomAmenityId(int roomAmenityId) {
        this.roomAmenityId = roomAmenityId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Amenity getAmenity() {
        return amenity;
    }

    public void setAmenity(Amenity amenity) {
        this.amenity = amenity;
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
