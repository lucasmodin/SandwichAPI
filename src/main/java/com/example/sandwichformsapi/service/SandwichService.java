package com.example.sandwichformsapi.service;
import com.example.sandwichformsapi.model.SandwichOrder;
import com.example.sandwichformsapi.repository.SandwichRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SandwichService {
    private SandwichRepository sandwichRepository;

    public SandwichService(SandwichRepository sandwichRepository) {
        this.sandwichRepository = sandwichRepository;
    }

    public List<SandwichOrder> sandwichList() {
        return sandwichRepository.getSandwichList();
    }

    public SandwichOrder placeOrder(SandwichOrder sandwichOrder) {
        return sandwichRepository.placeOrder( sandwichOrder );
    }

    public SandwichOrder updateOrder(UUID id) {
        return sandwichRepository.getOrderById(id);
    }


}
