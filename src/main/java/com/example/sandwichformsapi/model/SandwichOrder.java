package com.example.sandwichformsapi.model;

public class SandwichOrder {
    private Bread breadType;
    private Filling fillingType;
    private Size sizeType;

    public SandwichOrder() {

    }

    public Bread getBreadType() {
        return breadType;
    }

    public Filling getFillingType() {
        return fillingType;
    }

    public Size getSizeType() {
        return sizeType;
    }

    public void setBreadType(Bread breadType) {
        this.breadType = breadType;
    }

    public void setFillingType(Filling fillingType) {
        this.fillingType = fillingType;
    }

    public void setSizeType(Size sizeType) {
        this.sizeType = sizeType;
    }
}
