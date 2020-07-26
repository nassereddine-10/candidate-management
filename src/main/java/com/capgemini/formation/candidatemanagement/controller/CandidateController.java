package com.capgemini.formation.candidatemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.formation.candidatemanagement.entity.Candidate;
import com.capgemini.formation.candidatemanagement.service.CandidateService;

@RestController
public class CandidateController {
	
	@Autowired
	CandidateService candService;

	@RequestMapping(method = RequestMethod.POST, value = "/addCandidate")
	//@PostMapping(path= "/addCandidate", produces = "application/json")
	public void addCandidate(@RequestBody Candidate candidate) {
		candService.addCandidate(candidate);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/findCandidates")
	public List<Candidate> findCandidates() {
		return candService.findCandidates();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteCandidate")
	//@DeleteMapping(path = "/deleteCandidate/{candDelete}")
	public void deleteCandidate (@RequestParam int candDelete) {
		candService.deleteCandidate(candDelete);
		
	}

}
