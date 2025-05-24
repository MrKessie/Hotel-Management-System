package com.hms.HotelManagementSystem.Enum;

public enum IdType {
    PASSPORT("Passport"),
    DRIVER_LICENSE("Driver License");

    private final String displayName;

    IdType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
