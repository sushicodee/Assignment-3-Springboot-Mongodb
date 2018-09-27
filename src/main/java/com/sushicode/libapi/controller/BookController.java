package com.sushicode.libapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sushicode.libapi.model.Book;

import com.sushicode.libapi.service.BookService;
@RestController
@RequestMapping("/books")
public class BookController {
	
	@RequestMapping(value="/abc")
	@ResponseBody
	public String abc() {
		return "abcnfewafuiwe";
	}
	
	
	@Autowired
	BookService bookService;
	
																																																																																																																																																																							//create
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public void create(@RequestBody Book book) {
		bookService.createBook(book);
	
	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
	
	//read
	@RequestMapping(method=RequestMethod.GET ,value="/{isbn}")
	public Book read(@PathVariable String isbn) {
		return bookService.readBook(isbn);
	}

	
	//update
	@RequestMapping(value="/update",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateBook( @RequestBody Book book) {
		bookService.updateBook(book);
	}

	//delete
	@RequestMapping(method=RequestMethod.DELETE,value="/{isbn}")
	public void deleteBook(@PathVariable String isbn) {
		bookService.deleteBook(isbn);
	}
	//getall
	@RequestMapping(method=RequestMethod.GET)
	public List<Book> getAll(){
		return bookService.readAllBook();
	}
}

