package com.sushicode.libapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sushicode.libapi.model.Issue;
import com.sushicode.libapi.service.IssueService;

@RestController
@RequestMapping("/issue")
public class IssueController {
	@Autowired
	public IssueService issueService;
	//create
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> issueBooks(@RequestBody Issue issue) {
		return issueService.issueBook(issue);
	}

}
