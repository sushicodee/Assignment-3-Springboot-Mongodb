package com.sushicode.libapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sushicode.libapi.model.Issue;
import com.sushicode.libapi.service.IssueService;

@RestController
@RequestMapping("/issues")
public class IssueController {
	@Autowired
	public IssueService issueService;
	//create
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> issueBooks(@RequestBody Issue issue) {
		return issueService.issueBook(issue);
	}
	 
	 //getIssue 
	@RequestMapping(value="/{iid}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Issue> getIssues(@PathVariable String iid){
		return issueService.getIssue(iid);
	}
	
	//getAllIssue
	@RequestMapping(method=RequestMethod.GET)
	public List<Issue> getAllIssue() {
		return issueService.getAllIssue();
	}
	
	
	
	//updateIssue
	@RequestMapping(value="/update",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public Issue updateIssue(@RequestBody Issue issue) {
		return issueService.updateIssue(issue);
		
	}
	
	
	//deleteIssue
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{iid}")
	public void deleteIssues(@PathVariable String iid) {
		issueService.deleteIssue(iid);
		
	}

	

}
