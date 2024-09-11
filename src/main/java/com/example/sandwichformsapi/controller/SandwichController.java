package com.example.sandwichformsapi.controller;


import com.example.sandwichformsapi.model.*;
import com.example.sandwichformsapi.service.SandwichService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class SandwichController {
    private final SandwichService sandwichService;

    public SandwichController(SandwichService sandwichService) {
        this.sandwichService = sandwichService;
    }
    @GetMapping("/order")
    public String showOrderForm(Model model) {
        SandwichOrder sandwichOrder = new SandwichOrder();
        sandwichOrder.setSizeType(Size.LARGE);
        model.addAttribute("sandwichOrder", sandwichOrder);
        model.addAttribute("breads", Bread.values());
        model.addAttribute("fillings", Filling.values());
        model.addAttribute("sizes", Size.values());
        return "order-form";
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute SandwichOrder sandwichOrder) {
        sandwichService.placeOrder(sandwichOrder);
        return "redirect:/order";
    }

    @GetMapping("/orders")
    public String showOrders(Model model) {
        model.addAttribute("orders", sandwichService.sandwichList());
        return "order-list";
    }

}
