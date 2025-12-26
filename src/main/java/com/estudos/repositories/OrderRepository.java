package com.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
