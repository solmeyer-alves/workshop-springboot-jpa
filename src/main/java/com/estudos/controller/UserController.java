package com.estudos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(null, "Solmayer Alves", "solmayer@gmail.com", "98887888", "54123");
		return ResponseEntity.ok().body(u);
	}
}
