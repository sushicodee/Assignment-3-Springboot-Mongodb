package com.sushicode.libapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sushicode.libapi.model.Book;
import com.sushicode.libapi.model.Issue;
import com.sushicode.libapi.model.User;
import com.sushicode.libapi.repository.BookRepository;
import com.sushicode.libapi.repository.IssueRepository;
import com.sushicode.libapi.repository.UserRepository;

@Service
public class IssueService {
	@Autowired
	public IssueRepository issueRepository;
	@Autowired
	public BookRepository bookRepository;
	@Autowired
	public UserRepository userRepository;
	@Autowired
	public BookService bookService;

	public ResponseEntity<?> issueBook(Issue issue) {
		Book book=bookRepository.findByIsbn(issue.getIsbn()).get();
		if (book.getAvaliability()==true) {
				
			if(book.getQuantity() >1) {
				book.setQuantity(book.getQuantity()-1);
				bookService.updateBook(book);
				issueRepository.save(issue);
			}
			else {
			book.setAvaliability(false);
			bookService.updateBook(book);
			
			}
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
				
		
		
		}

	public ResponseEntity<Issue> getIssue(String iid) {
					Optional<Issue> issue= issueRepository.findById(iid);
					if(issue.isPresent()) {
						return new ResponseEntity<Issue>(issue.get(), HttpStatus.OK);
					}
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		
	
}


	public List<Issue> getAllIssue() {
		return issueRepository.findAll();
		
	}

	public Issue updateIssue(Issue issue) {
		return issueRepository.save(issue);
		
		
		
	}

	public void deleteIssue(String iid) {
		//Issue issue=issueRepository.findById(iid).get();
		issueRepository.deleteById(iid);
		
		
		
	}

}