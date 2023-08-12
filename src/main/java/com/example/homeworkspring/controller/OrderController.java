package com.example.homeworkspring.controller;

import com.example.homeworkspring.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public Map<Integer,Integer> addOrder(@RequestParam("id") List<Integer> id) {
        return orderService.add(id);
    }

    @GetMapping("/get")
    public Map<Integer,Integer> getOrder() {
        return orderService.get();
    }
}
