package com.divyan.ecommerce.ecommerce_backend.Respository;

import com.divyan.ecommerce.ecommerce_backend.Entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
