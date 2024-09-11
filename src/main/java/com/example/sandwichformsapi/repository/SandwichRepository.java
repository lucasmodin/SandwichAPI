package com.example.sandwichformsapi.repository;
import com.example.sandwichformsapi.model.SandwichOrder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class SandwichRepository {

    private final List<SandwichOrder> sandwichList = new ArrayList<>();

    public SandwichRepository() {

    }

    public List<SandwichOrder> getSandwichList() {
        return sandwichList;
    }

    public SandwichOrder placeOrder(SandwichOrder sandwich) {
        sandwichList.add(sandwich);
        return sandwich;
    }





}
