package com.hms.HotelManagementSystem.Model;

import com.hms.HotelManagementSystem.Converters.StringListConverter;
import com.hms.HotelManagementSystem.Enum.RoomStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roomId;
    @NotNull(message = "Room number cannot be null")
    @Positive
    private int roomNumber;
    @OneToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
    @NotNull(message = "Floor number cannot be null")
    @Positive
    private int floorNumber;
    @Enumerated(EnumType.STRING)
    private RoomStatus status;
    @Convert(converter = StringListConverter.class)
    private List<String> features;
    @NotNull(message = "Description cannot be null")
    @Size(min = 10, message = "Description must have at least 10 characters")
    private String description;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;

    public Room() {
    }

    public Room(@NotNull(message = "Room number cannot be null") int roomNumber, RoomType roomType, @NotNull(message = "Floor number cannot be null") int floorNumber, RoomStatus status, List<String> features, @NotNull(message = "Description cannot be null") String description, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.floorNumber = floorNumber;
        this.status = status;
        this.features = features;
        this.description = description;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }


    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
