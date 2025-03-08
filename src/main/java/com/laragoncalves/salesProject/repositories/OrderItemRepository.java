package com.laragoncalves.salesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laragoncalves.salesProject.entities.OrderItem;
import com.laragoncalves.salesProject.entities.PK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
