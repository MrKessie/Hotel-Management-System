package com.hms.HotelManagementSystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int promotionId;
    @NotNull(message = "Promo Code cannot be null")
    @Size(min = 5, message = "Promo Code must have at least 5 characters")
    private String promoCode;
    @NotNull(message = "Description cannot be null")
    @Size(min = 10, message = "Description must have at least 10 characters")
    private String description;
    @NotNull(message = "Discount Type cannot be null")
    @Size(min = 5, message = "Discount Type must have at least 5 characters")
    private String discountType;
    @Positive
    private int discountValue;
    @Column(nullable = false, updatable = false)
    private LocalDate startDate;
    @Column(nullable = false, updatable = false)
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
    @Positive
    private int minimumStay;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createDate;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;


    public Promotion() {
    }


    public Promotion(@NotNull(message = "Promo Code cannot be null") String promoCode, @NotNull(message = "Description cannot be null") String description, @NotNull(message = "Discount Type cannot be null") String discountType, int discountValue, LocalDate startDate, LocalDate endDate, RoomType roomType, int minimumStay, LocalDateTime createDate, LocalDateTime updatedDate) {
        this.promoCode = promoCode;
        this.description = description;
        this.discountType = discountType;
        this.discountValue = discountValue;
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomType = roomType;
        this.minimumStay = minimumStay;
        this.createDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }


    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public int getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(int discountValue) {
        this.discountValue = discountValue;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getMinimumStay() {
        return minimumStay;
    }

    public void setMinimumStay(int minimumStay) {
        this.minimumStay = minimumStay;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
