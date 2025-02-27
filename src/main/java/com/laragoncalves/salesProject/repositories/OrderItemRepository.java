package com.laragoncalves.salesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laragoncalves.salesProject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
