package com.example.sandwichformsapi.model;

public enum Filling {
    CHICKEN("Chicken"),
    AVOCADO("Avocado"),
    TOMATO("Tomato"),
    PESTO("Pesto"),
    TUNA("Tuna"),
    CUCUMBER("Cucumber");

    private String displayName;

    Filling(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }

}
