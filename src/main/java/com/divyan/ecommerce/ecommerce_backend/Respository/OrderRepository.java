package com.divyan.ecommerce.ecommerce_backend.Respository;

import com.divyan.ecommerce.ecommerce_backend.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByUserId(Long user_id);
}
