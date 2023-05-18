package com.ty.springBoot_FoodApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springBoot_FoodApp.config.ResponseStructure;
import com.ty.springBoot_FoodApp.dto.User;
import com.ty.springBoot_FoodApp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/saveUser")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
//	@PostMapping("/saveUser")
//	public ResponseStructure<User> saveUser(@RequestBody User user) {
//		return service.saveUser(user);
//	}
	
//	@PostMapping("/saveUser")
//	public User saveUser(@RequestBody User user) {
//		return service.saveUser(user);
//	}
	
	@PutMapping("/updateUser")
	public ResponseStructure<User> updateUser(int id,@RequestBody User user) {
		return service.updateUser(id, user);
	}
	
//	@PutMapping("/updateUser")
//	public User updateUser(int id,@RequestBody User user) {
//		return service.updateUser(id, user);
//	}
	@DeleteMapping("/deleteUser")
	public User deleteUser(@RequestParam int id) {
		return service.deleteUser(id);
	}
	@GetMapping("/getUserById")
	public User getUserById(int id) {
		return service.getUserById(id);
	}
}
