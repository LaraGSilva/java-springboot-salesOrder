package com.laragoncalves.salesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laragoncalves.salesProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
