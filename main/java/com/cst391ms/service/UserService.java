package com.cst391ms.service;

import java.util.List;

import com.cst391ms.model.Users;

public interface UserService {
	
	public List<Users> getAllUsers();
	public Users getById(Long Id); 
	public void saveOrUpdate(Users user);
	public void deleteUser(Long id);
	
	

}
