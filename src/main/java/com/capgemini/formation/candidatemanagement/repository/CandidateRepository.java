package com.capgemini.formation.candidatemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.capgemini.formation.candidatemanagement.entity.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

}
