package com.ty.springBoot_FoodApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springBoot_FoodApp.dto.Items;
import com.ty.springBoot_FoodApp.service.ItemsService;

@RestController
public class ItemsController {

	@Autowired
	private ItemsService service;
	
	@PostMapping("/saveItems")
	public Items saveItems(@RequestBody Items items) {
		return service.saveItems(items);
	}
	@PutMapping("/updateItems")
	public Items updateItems(int item_id,@RequestBody Items items) {
		return service.updateItems(item_id, items);
	}
	@DeleteMapping("/deleteItems")
	public Items deleteItems(@RequestParam int item_id) {
		return service.deleteItems(item_id);
	}
	@GetMapping("/getItemsById")
	public Items getItemsById(int item_id) {
		return service.getItemsById(item_id);
	}
}
