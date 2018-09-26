package com.sushicode.libapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushicode.libapi.repository.BookRepository;
import com.sushicode.libapi.model.Book;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;

	public void createBook(Book book) {
		System.out.println(book);
		bookRepository.save(book);
	}
		
	public Book readBook(String isbn) {
		System.out.println("id is "+isbn);
		return bookRepository.findByIsbn(isbn).get();
	}
	public List<Book> readAllBook() {
		return bookRepository.findAll();	
	}
	public void updateBook(Book book) {
		bookRepository.save(book);
	}
	
	public void deleteBook(String isbn) {
		Book book = bookRepository.findByIsbn(isbn).get();
		System.out.println(book);
		bookRepository.delete(book);
	}
	
	

}
