package com.ty.springBoot_FoodApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springBoot_FoodApp.dao.MenuDao;
import com.ty.springBoot_FoodApp.dto.Menu;

@Service
public class MenuService {

	@Autowired
	private MenuDao dao;
	
	public Menu saveMenu(Menu menu) {
		return dao.saveMenu(menu);
	}
	public Menu updateMenu(int mid, Menu menu) {
		Menu menu2=dao.updateMenu(mid, menu);
		if(menu2!=null) {
			return menu;
		}else {
			return null;
		}
	}
	public Menu deleteMenu(int mid) {
		Menu menu=dao.deleteMenu(mid);
		if(menu!=null) {
			return menu;
		}else {
			return null;
		}
	}
	public Menu getMenuById(int mid) {
		Menu menu=dao.getMenuById(mid);
		if(menu!=null) {
			return menu;
		}else {
			return null;
		}
	}
	public Menu getMenyByName(String mname) {
		Menu menu=dao.getMenuByName(mname);
		if(menu!=null) {
			return menu;
		}else {
			return null;
		}
	}
}
