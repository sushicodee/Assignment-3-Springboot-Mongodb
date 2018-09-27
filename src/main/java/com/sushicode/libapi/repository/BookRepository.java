package com.sushicode.libapi.repository;


import java.util.List;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sushicode.libapi.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
	

	public List<Book> findByTitle(String title);
	public Optional<Book> findByIsbn(String isbn);

}