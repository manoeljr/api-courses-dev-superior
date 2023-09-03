package com.educandoweb.course.services.impl;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.services.OrderService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.repository = orderRepository;
    }

    @Override
    public List<Order> listOrder() {
        return repository.findAll().stream().toList();
    }

    @Override
    public Order findById(Long id) {
        Optional<Order> order =  repository.findById(id);
        return order.get();
    }

}
