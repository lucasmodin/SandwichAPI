package com.example.sandwichformsapi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SandwichOrder {
    private Bread breadType;
    private Filling fillingType;
    private Size sizeType;
    private UUID orderId;

    public SandwichOrder() {
    this.orderId = UUID.randomUUID();
    }

    public UUID getOrderId() {
        return orderId;
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

    public void setSizeType(Size sizeType) {
        this.sizeType = sizeType;
    }

    public void setFillingType(Filling fillingType) {
        this.fillingType = fillingType;
    }
}
