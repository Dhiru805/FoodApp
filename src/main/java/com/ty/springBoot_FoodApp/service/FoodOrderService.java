package com.ty.springBoot_FoodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springBoot_FoodApp.dao.FoodOrderDao;
import com.ty.springBoot_FoodApp.dto.FoodOrder;
import com.ty.springBoot_FoodApp.dto.Items;

@Service
public class FoodOrderService {

	@Autowired
	private FoodOrderDao dao;
	
	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		List<Items> list= foodOrder.getItems();
		double totalprice=0;
		for(Items items:list) {
			totalprice+=items.getCost()*items.getQuantity();
			foodOrder.setTotalprice(totalprice);
		}
		return dao.saveFoodOrder(foodOrder);
	}
	public FoodOrder updateFoodOrder(int id, FoodOrder foodOrder) {
		FoodOrder foodOrder2= dao.getFoodOrder(id);
		if(foodOrder2!=null) {
			List<Items> list=foodOrder2.getItems();
			double totalprice=0;
			for(Items items:list) {
				totalprice+=items.getCost()*items.getQuantity();
			}
			foodOrder.setTotalprice(totalprice);
			
			return dao.updateFoodOrder(id, foodOrder);
		}else {
		    return null;
	    }
	}
	public FoodOrder deleteFoodOrder(int id) {
		FoodOrder foodOrder=dao.deleteFoodOrder(id);
		if(foodOrder!=null) {
			return foodOrder;
		}else {
			return null;
		}
	}
	public FoodOrder getFoodOrder(int id) {
		FoodOrder foodOrder=dao.getFoodOrder(id);
		if(foodOrder!=null) {
			return foodOrder;
		}else {
			return null;
		}
	}
}
