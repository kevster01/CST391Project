package com.cst391ms.respository;

import org.springframework.data.repository.CrudRepository;

import com.cst391ms.model.Users;

public interface UserRepository extends  CrudRepository<Users, Long>{
	
	

}
