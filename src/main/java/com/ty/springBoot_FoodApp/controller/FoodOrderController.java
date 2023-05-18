package com.ty.springBoot_FoodApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springBoot_FoodApp.dto.FoodOrder;
import com.ty.springBoot_FoodApp.service.FoodOrderService;

@RestController
public class FoodOrderController {

	@Autowired
	private FoodOrderService service;
	
	@PostMapping("/saveFoodOrder")
	public FoodOrder saveFoodOrder(@RequestBody FoodOrder foodOrder) {
		return service.saveFoodOrder(foodOrder);
	}
	@PutMapping("/updateFoodOrder")
	public FoodOrder updateFoodOrder(@RequestParam int id,@RequestBody FoodOrder foodOrder) {
		return service.updateFoodOrder(id, foodOrder);
	}
	@DeleteMapping("/deleteFoodOrder")
	public FoodOrder deleteFoodOrder(@RequestParam int id) {
		return service.deleteFoodOrder(id);
	}
	@GetMapping("/getFoodOrderById")
	public FoodOrder getFoodOrder(@RequestParam int id) {
		return service.getFoodOrder(id);
	}
}
