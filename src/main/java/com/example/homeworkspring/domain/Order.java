package com.example.homeworkspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class Order{
    private Map<Integer, Integer> products = new HashMap<>();
    public Map<Integer,Integer> addOrder(List<Integer> id) {
        for (Integer i : id) {
            if (products.containsKey(i)) {
                products.put(i, products.get(i) + 1);
            } else {
                products.put(i, 1);
            }
        }
        return products;
    }

    public Map<Integer, Integer> getOrder() {
        return products;
    }

}
