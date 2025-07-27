package com.hms.HotelManagementSystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Amenity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int amenityId;
    @NotNull(message = "Amenity Name cannot be null")
    @Size(min = 10, message = "Amenity Name must have at least 10 characters")
    private int amenityName;
    @NotNull(message = "Description cannot be null")
    @Size(min = 10, message = "Description must have at least 10 characters")
    private String description;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;


    public Amenity() {
    }

    public Amenity(@NotNull(message = "Amenity Name cannot be null") int amenityName, @NotNull(message = "Description cannot be null") String description, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.amenityName = amenityName;
        this.description = description;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }


    public int getAmenityId() {
        return amenityId;
    }

    public void setAmenityId(int amenityId) {
        this.amenityId = amenityId;
    }

    public int getAmenityName() {
        return amenityName;
    }

    public void setAmenityName(int amenityName) {
        this.amenityName = amenityName;
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
