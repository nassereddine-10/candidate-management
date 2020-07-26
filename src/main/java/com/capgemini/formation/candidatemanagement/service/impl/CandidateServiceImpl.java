package com.capgemini.formation.candidatemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.formation.candidatemanagement.entity.Candidate;
import com.capgemini.formation.candidatemanagement.repository.CandidateRepository;
import com.capgemini.formation.candidatemanagement.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService{

	@Autowired
	CandidateRepository candRepo;
	
	
	public void addCandidate(Candidate candidate) {
		candRepo.saveAndFlush(candidate);
	}
	
	public List<Candidate> findCandidates() {
		return candRepo.findAll();
	}

	
	public void deleteCandidate (int condMatricule) {
		candRepo.deleteById(condMatricule);
	}

}
