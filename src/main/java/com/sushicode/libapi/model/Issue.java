package com.sushicode.libapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Issue")
public class Issue {
	@Id
	private String iid;
	private String doi;
	private String isbn;
	private String id;
	
	public Issue() {}
	
	public Issue(String iid, String doi, String isbn, String id) {
		this.iid = iid;
		this.doi = doi;
		this.isbn = isbn;
		this.id = id;
	}
	
	
	public String getIid() {
		return iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	

}
