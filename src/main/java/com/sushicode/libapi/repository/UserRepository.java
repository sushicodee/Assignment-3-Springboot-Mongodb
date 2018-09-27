package com.sushicode.libapi.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sushicode.libapi.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	public List<User> findByFirstName(String firstName);
	public Optional<User> findById(String id);
}
