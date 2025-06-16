package com.hms.HotelManagementSystem.Enum;

public enum ServiceName {
    ROOM_SERVICE ("Room Service"),
    LAUNDRY ("Laundry"),
    SPA("Spa");

    private final String displayName;

    ServiceName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
