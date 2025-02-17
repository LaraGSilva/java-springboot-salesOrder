package com.laragoncalves.salesProject.resources;

import java.lang.annotation.Retention;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laragoncalves.salesProject.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Lara", "Lara@silva","1111111","SENHA");
		return ResponseEntity.ok().body(u);
	}
}
