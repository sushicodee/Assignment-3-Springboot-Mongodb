package com.sushicode.libapi.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="User")
public class User implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String firstName;
	
	private String lastName;
	
	
	private String password;
	
	public User() {
		
	}
		
	
	
	
		public User(String id, String firstName, String lastName, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}




		public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

		public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



		@Override
		public String toString() {
			return String.format("User[id='%s',firstName='%s',lastName='%s']", id);
		}
		
		
		
	}

