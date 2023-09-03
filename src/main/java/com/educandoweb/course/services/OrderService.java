package com.educandoweb.course.services;

import com.educandoweb.course.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> listOrder();
    Order findById(Long id);
}
