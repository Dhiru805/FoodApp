package com.ty.springBoot_FoodApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springBoot_FoodApp.dao.ItemsDao;
import com.ty.springBoot_FoodApp.dto.Items;

@Service
public class ItemsService {

	@Autowired
	private ItemsDao dao;
	
	public Items saveItems(Items items) {
		return dao.saveItems(items);
	}
	public Items updateItems(int item_id, Items items) {
		Items items2=dao.updateItems(item_id, items);
		if(items2!=null) {
			return items;
		}else {
			return null;
		}
	}
	public Items deleteItems(int item_id) {
		Items items=dao.deleteItems(item_id);
		if(items!=null) {
			return items;
		}else {
			return null;
		}
	}
	public Items getItemsById(int item_id) {
		Items items=dao.getItemsById(item_id);
		if(items!=null) {
			return items;
		}else {
			return null;
		}
	}
}
