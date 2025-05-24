package com.hms.HotelManagementSystem.Model;

import com.hms.HotelManagementSystem.Converters.StringListConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int typeId;
    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 30, message = "Name must have at least 2 characters")
    private String name;
    @NotNull(message = "Description cannot be null")
    @Size(min = 2, message = "Description must have at least 2 characters")
    private String description;
    @NotNull(message = "Price cannot be null")
    @Positive
    private double price;
    @NotNull(message = "Capacity cannot be null")
    @Min(1)
    @Positive
    private int capacity;
    @Convert(converter = StringListConverter.class)
    private List<String> amenities;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;


    public RoomType() {
    }

    public RoomType(@NotNull(message = "Name cannot be null") String name, @NotNull(message = "Description cannot be null") String description, @NotNull(message = "Price cannot be null") double price, @NotNull(message = "Capacity cannot be null") int capacity, List<String> amenities, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.capacity = capacity;
        this.amenities = amenities;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }


    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
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
