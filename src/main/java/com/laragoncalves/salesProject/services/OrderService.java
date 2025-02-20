package com.laragoncalves.salesProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laragoncalves.salesProject.entities.Order;
import com.laragoncalves.salesProject.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> findAll(){
		return OrderRepository.findAll();
	}
	
	public Order findbyId(Long id) {
		Optional <Order> obj = OrderRepository.findById(id);
		return obj.get();
	}
	
			
}
