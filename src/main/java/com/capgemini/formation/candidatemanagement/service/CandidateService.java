package com.capgemini.formation.candidatemanagement.service;

import java.util.List;

import com.capgemini.formation.candidatemanagement.entity.Candidate;

public interface CandidateService {
	
	void addCandidate(Candidate candidate);
	
	List<Candidate> findCandidates();
	
	void deleteCandidate(int candDelete);

}