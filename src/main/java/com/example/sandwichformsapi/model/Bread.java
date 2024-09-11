package com.example.sandwichformsapi.model;

public enum Bread {
    WHITE("White"),
    RYE("Rye"),
    BAGEL("Bagel");

    private String displayName;
    Bread(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
