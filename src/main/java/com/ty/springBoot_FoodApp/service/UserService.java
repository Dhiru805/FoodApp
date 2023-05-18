package com.ty.springBoot_FoodApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.springBoot_FoodApp.config.ResponseStructure;
import com.ty.springBoot_FoodApp.dao.UserDao;
import com.ty.springBoot_FoodApp.dto.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;

	public ResponseEntity<ResponseStructure<User>> saveUser(User user){
		ResponseStructure<User>responseStructure=new ResponseStructure<>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("user successfully saved");
		responseStructure.setData(dao.saveUser(user));
		return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.CREATED);
	}
	
//	public ResponseStructure<User> saveUser(User user){
//		ResponseStructure<User>responseStructure=new ResponseStructure<>();
//		responseStructure.setStatus(HttpStatus.CREATED.value());
//		responseStructure.setMessage("user successfully saved");
//		responseStructure.setData(dao.saveUser(user));
//		return responseStructure;
//	}
//	
//	public User saveUser(User user) {
//		return dao.saveUser(user);
//	}
	
	public ResponseStructure<User> updateUser(int id,User user) {
		User user2= dao.updateUser(id, user);
		ResponseStructure<User> responseStructure=new ResponseStructure<>();
		if(user2!=null) {
			responseStructure.setStatus(HttpStatus.CREATED.value());
			responseStructure.setMessage("Updated");
			responseStructure.setData(user);
			return responseStructure;
		}else {
			return null;
		}
	}
	
//	public User updateUser(int id,User user) {
//		User user2= dao.updateUser(id, user);
//		if(user2!=null) {
//			return user;
//		}else {
//			return null;
//		}
//	}
	public User deleteUser(int id) {
		User user=dao.deleteUser(id);
		if(user!=null) {
			return user;
		}else {
			return null;
		}
	}
	public User getUserById(int id) {
		User user= dao.getUserById(id);
		if(user!=null) {
			return user;
		}else {
			return null;
		}
	}
}
