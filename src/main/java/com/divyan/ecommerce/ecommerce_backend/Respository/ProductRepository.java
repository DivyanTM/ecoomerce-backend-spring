package com.divyan.ecommerce.ecommerce_backend.Respository;

import com.divyan.ecommerce.ecommerce_backend.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
