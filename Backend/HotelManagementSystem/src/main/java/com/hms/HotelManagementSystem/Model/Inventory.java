package com.hms.HotelManagementSystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int inventoryId;
    @NotNull(message = "Item Name cannot be null")
    @Size(min = 2, max = 20,  message = "Item Name must have at least 2 characters")
    private String itemName;
    @Positive
    private int quantity;
    @NotNull(message = "Category cannot be null")
    @Size(min = 2, max = 20,  message = "Category must have at least 2 characters")
    private String category;
    @NotNull(message = "Unit cannot be null")
    @Size(min = 2, max = 20,  message = "Unit must have at least 2 characters")
    private String unit;
    @Positive
    private int reorderLevel;
    @NotNull(message = "Supplier cannot be null")
    @Size(min = 2, max = 50,  message = "Supplier must have at least 2 characters")
    private String supplier;
    @NotNull(message = "Storage Location cannot be null")
    @Size(min = 2, max = 30,  message = "Storage Location must have at least 2 characters")
    private String storageLocation;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime createdDate;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime updatedDate;


    public Inventory() {
    }

    public Inventory(@NotNull(message = "Item Name cannot be null") String itemName, int quantity, @NotNull(message = "Category cannot be null") String category, @NotNull(message = "Unit cannot be null") String unit, int reorderLevel, @NotNull(message = "Supplier cannot be null") String supplier, @NotNull(message = "Storage Location cannot be null") String storageLocation, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = category;
        this.unit = unit;
        this.reorderLevel = reorderLevel;
        this.supplier = supplier;
        this.storageLocation = storageLocation;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }


    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
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
