package com.sushicode.libapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Book {
	@Id
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private String description;
	private int quantity;
	private Boolean avaliability;
	public Book() {}




	public Book(String isbn, String title, String author, String publisher, String description) {

		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.description = description;
		this.quantity=quantity;
		this.avaliability=avaliability;
	}	
	

	public Boolean getAvaliability() {
		return avaliability;
	}

	public void setAvaliability(Boolean avaliability) {
		this.avaliability = avaliability;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
