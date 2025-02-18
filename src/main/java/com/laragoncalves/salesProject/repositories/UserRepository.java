package com.laragoncalves.salesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laragoncalves.salesProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
