package com.example.homeworkspring.service;

import com.example.homeworkspring.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderService {
    private Order order;

    public OrderService(Order order) {
        this.order = order;
    }

    public Map<Integer, Integer> add(List<Integer>id) {
       return order.addOrder(id);
    }

    public Map<Integer, Integer> get() {
        return order.getOrder();
    }
}
