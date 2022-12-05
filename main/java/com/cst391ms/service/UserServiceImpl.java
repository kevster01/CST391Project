package com.cst391ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cst391ms.model.Users;
import com.cst391ms.respository.UserRepository;

import jakarta.transaction.Transactional;



@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	
	/**
	 * method returns all users from list
	 */
	@Autowired
	UserRepository repository; 
	@Override
	public List<Users> getAllUsers() {
		return (List<Users>)repository.findAll();
	}

	/**
	 * method searches in repository
	 * and returns users by id 
	 */
	@Override
	public Users getById(Long id) {
		return repository.findById(id).get();
	}

	/**
	 * method updates users in repository
	 */
	@Override
	public void saveOrUpdate(Users user) {
		repository.save(user);
		
	}

	/**
	 * Method deletes user by id input 
	 */
	@Override
	public void deleteUser(Long id) {
		repository.deleteById(id);
		
	}

}
