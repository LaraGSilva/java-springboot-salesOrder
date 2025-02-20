package com.laragoncalves.salesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laragoncalves.salesProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
