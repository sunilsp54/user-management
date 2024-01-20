package com.zelton.training.usermanagement.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zelton.training.usermanagement.domain.User;
import com.zelton.training.usermanagement.services.UserService;
import com.zelton.training.usermanagement.web.resources.UserResource;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
		
	@GetMapping(value = "/users/{userId}")
	public @ResponseBody UserResource getUser(@PathVariable String userId) {
		return userService.getUserById(userId);		
	}

}
