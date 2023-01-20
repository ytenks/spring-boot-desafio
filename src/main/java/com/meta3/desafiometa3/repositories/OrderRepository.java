package com.meta3.desafiometa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meta3.desafiometa3.classes.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
