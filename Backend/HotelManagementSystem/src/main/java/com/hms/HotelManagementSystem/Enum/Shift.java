package com.hms.HotelManagementSystem.Enum;

public enum Shift {
    DAY_SHIFT("Day Shift"),
    NIGHT_SHIFT("Night Shift");

    public final String displayName;

    Shift(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
