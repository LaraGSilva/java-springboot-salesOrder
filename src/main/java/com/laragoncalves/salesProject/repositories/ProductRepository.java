package com.laragoncalves.salesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laragoncalves.salesProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
