package com.learn.InputValidator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.InputValidator.model.User;

@RestController
public class UserController {
	
	@Autowired
	private User user;

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		ResponseEntity<User> response = null;

		response = ResponseEntity.ok(user);
		return response;
	}
}
