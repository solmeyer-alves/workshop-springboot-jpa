package com.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.entities.OrderItem;
import com.estudos.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
