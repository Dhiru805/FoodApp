package com.ty.springBoot_FoodApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springBoot_FoodApp.dto.Menu;
import com.ty.springBoot_FoodApp.service.MenuService;

@RestController
public class MenuController {

	@Autowired
	private MenuService service;
	
	@PostMapping("/saveMenu")
	public Menu saveMenu(@RequestBody Menu menu) {
		return service.saveMenu(menu);
	}
	@PutMapping("/updateMenu")
	public Menu updateMenu(int mid,@RequestBody Menu menu) {
		return service.updateMenu(mid, menu);
	}
	@DeleteMapping("/deleteMenu")
	public Menu deleteMenu(@RequestParam int mid) {
		return service.deleteMenu(mid);
	}
	@GetMapping("/getMenuById")
	public Menu getMenuById(int mid) {
		return service.getMenuById(mid);
	}
	@GetMapping("/getMenuByName")
	public Menu getMenuByName(@RequestParam String mname) {
		return service.getMenyByName(mname);
	}
}
