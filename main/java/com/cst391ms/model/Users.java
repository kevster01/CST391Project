package com.cst391ms.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Users")
public class Users implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name; 
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password; 
	
	public Users()
	{
		
	}
	
	/**
	 * Method meant for getting id
	 * @return id 
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Method mean for setting id
	 * @return id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * Method meant for getting name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method mean for getting id
	 * 
	 */
	public void setName(String name) {
		this.name= name;
	}

	/**
	 * Method mean for getting email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Method mean for setting email
	 * @return email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Method mean for getting password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Method mean for setting password
	 * @return password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Method meant for converting data input into string 
	 */
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	
}
