package com.sushicode.libapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sushicode.libapi.model.User;
import com.sushicode.libapi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	//create
	@RequestMapping(value="/create" ,method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void createUser( @RequestBody User user) {
		 userService.updateUser(user);
	}
	
	//getUser
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public User getUsers(@PathVariable String id) {
		 return userService.getUsers(id);
	}
	
	
	//deleteUser
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deleteUsers(@PathVariable String id) {
		userService.deleteUser(id);
	}
	
	
	//readall
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAllUsers(){		
		return userService.getAllUser();
	}
	
	
	
	//update
	@RequestMapping(method=RequestMethod.PUT,value="/update")
	public void updateUsers( @RequestBody User user) {
		userService.updateUser(user);
		
	}
}
