package com.hms.HotelManagementSystem.Enum;

public enum RoomStatus {
    AVAILABLE ("Available"),
    OCCUPIED ("Occupied"),
    MAINTENANCE ("Maintenance");

    private final String displayName;

    RoomStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
