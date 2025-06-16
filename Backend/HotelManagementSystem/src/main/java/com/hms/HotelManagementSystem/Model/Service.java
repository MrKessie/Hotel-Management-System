package com.hms.HotelManagementSystem.Model;

import com.hms.HotelManagementSystem.Enum.ServiceName;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int serviceId;
    @Enumerated(EnumType.STRING)
    private ServiceName serviceName;
    private String description;
    @NotNull(message = "Price cannot be null")
    @Min(0)
    private double price;
    @CreationTimestamp
    @NotNull(message = "Created Date cannot be null")
    private LocalDateTime createdDate;
    @CreationTimestamp
    @NotNull(message = "Created Date cannot be null")
    private LocalDateTime updatedDate;

    public Service() {
    }

    public Service(ServiceName serviceName, String description, @NotNull(message = "Price cannot be null") double price, @NotNull(message = "Created Date cannot be null") LocalDateTime createdDate, @NotNull(message = "Created Date cannot be null") LocalDateTime updatedDate) {
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }


    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public ServiceName getServiceName() {
        return serviceName;
    }

    public void setServiceName(ServiceName serviceName) {
        this.serviceName = serviceName;
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
