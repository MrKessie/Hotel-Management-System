package com.hms.HotelManagementSystem.Enum;

public enum PaymentStatus {
    COMPLETED("Completed"),
    PENDING("Pending"),
    FAILED("Failed");

    private final String displayName;

    PaymentStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
