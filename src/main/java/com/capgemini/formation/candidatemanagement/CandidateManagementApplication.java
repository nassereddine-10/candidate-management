package com.capgemini.formation.candidatemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@SpringBootApplication
public class CandidateManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidateManagementApplication.class, args);
	}
	

}
