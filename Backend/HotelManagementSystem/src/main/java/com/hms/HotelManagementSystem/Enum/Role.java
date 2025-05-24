package com.hms.HotelManagementSystem.Enum;

public enum Role {
    ADMIN("Admin"),
    MANAGER("Manager"),
    STAFF("Staff"),
    CUSTOMER("Customer");

    private final String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
