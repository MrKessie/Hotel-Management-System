package com.hms.HotelManagementSystem.Enum;

public enum PaymentMethod {
    CASH ("Cash"),
    CARD ("Card"),
    MOMO("Momo");

    private final String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
