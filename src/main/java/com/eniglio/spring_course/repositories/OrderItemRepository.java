package com.eniglio.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eniglio.spring_course.entities.OrderItem;
import com.eniglio.spring_course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}