package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.UserController;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.UserService;

import jakarta.transaction.Transactional;

@SpringBootTest
public class test {

	@Autowired
	UserService userService;
	@Autowired
	UserRepository userRepository;

	@Autowired
	UserController userController;

	@Test
	public void 회원가입() throws Exception {

		//When
		// String str = userController.register("asddd", "Asd");
		// System.out.println(str);
	}
}
