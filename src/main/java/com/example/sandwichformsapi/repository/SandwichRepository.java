package com.example.sandwichformsapi.repository;
import com.example.sandwichformsapi.model.SandwichOrder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class SandwichRepository {

    private final List<SandwichOrder> sandwichList = new ArrayList<>();

    public SandwichRepository() {

    }

    public List<SandwichOrder> getSandwichList() {
        return sandwichList;
    }

    public SandwichOrder placeOrder(SandwichOrder sandwich) {
        for (int i = 0; i < sandwichList.size(); i++) {
            if (sandwichList.get(i).getOrderId().equals(sandwich.getOrderId())) {
                sandwichList.set(i, sandwich);
                return sandwich;
            }
            sandwichList.add(sandwich);
            return sandwich;
        }
        sandwichList.add(sandwich);
        return sandwich;
    }

    public SandwichOrder getOrderById(UUID id) {
        for(SandwichOrder sandwich : sandwichList) {
            if(sandwich.getOrderId().equals(id)) {
                return sandwich;
            }
        }
        return null;
    }





}
