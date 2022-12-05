package com.cst391ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cst391ms.model.Users;
import com.cst391ms.service.UserService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class UserController {

	@Autowired
	UserService service;
	
	/**
	 * method intended to creating users
	 * @param user
	 * @return
	 */
	@PostMapping("/save")
	public Users save(@RequestBody Users user)
	{
		service.saveOrUpdate(user);
		return user;
	}
	
	/**
	 * Method meant to return users 
	 * @return all users
	 */
	@GetMapping("/list")
	public List<Users>list(){
		return service.getAllUsers();
	}
	
	/**
	 * Method intended to show users found in the database
	 * from their individual id #
	 * @param id
	 * @return
	 */
	@GetMapping("/list/(id)")
	public Users getbyId(@PathVariable Long id)
	{
		return service.getById(id);
	}
	
	/**
	 * method intended to delete user based off 
	 * id 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/delete/(id)")
	public String deleteUser(@PathVariable (value = "id")Long id)
	{
		service.deleteUser(id);
		return "User ID: " + id + " Successfully";
	}
	
	
}
	

