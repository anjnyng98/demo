package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/register")
	public String register(@RequestBody HashMap<String, String> user) {
		String username = user.get("username");
		String password = user.get("password");
		return userService.registerUser(username, password); // Return "success" or "fail"
	}
}
