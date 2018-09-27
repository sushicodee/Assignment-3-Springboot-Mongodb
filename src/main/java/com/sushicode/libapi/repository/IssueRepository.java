package com.sushicode.libapi.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sushicode.libapi.model.Issue;


public interface IssueRepository extends MongoRepository<Issue, String>{

	public Optional<Issue> findById(String iid);
}
