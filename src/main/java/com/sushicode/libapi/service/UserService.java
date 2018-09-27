package com.sushicode.libapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushicode.libapi.model.User;
import com.sushicode.libapi.repository.UserRepository;

@Service
public class UserService {
	
@Autowired
UserRepository userRepository;

public void saveUsers(User user) {
	userRepository.save(user);
}

public User getUsers(String id) {
	
	return userRepository.findById(id).get();
}

public void deleteUser(String id) {
	User user=userRepository.findById(id).get();
	userRepository.delete(user);
	
}

public List<User> getAllUser() {

	return userRepository.findAll();
}

public void updateUser(User user) {
	userRepository.save(user);
}



}


