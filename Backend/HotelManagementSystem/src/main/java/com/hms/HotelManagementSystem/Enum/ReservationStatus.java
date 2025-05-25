package com.hms.HotelManagementSystem.Enum;

public enum ReservationStatus {
    CONFIRMED ("Confirmed"),
    CHECKED_IN ("Checked In"),
    CHECKED_OUT("Checked Out"),
    CANCELLED ("Cancelled");

    private final String displayName;

    ReservationStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
