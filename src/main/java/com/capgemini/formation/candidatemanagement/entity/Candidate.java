package com.capgemini.formation.candidatemanagement.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "candidate")
@Entity
public class Candidate {
	
	@Id
	@Column(name = "matricule")
	private Integer matricule;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "integrationDate")
	private String integrationDate;
	
	@Column(name = "programationLanguage")
	private String programationLanguage;

	public Candidate() {
		
	}
	
	//Constructor with fields
	public Candidate(Integer matricule, String name, String integrationDate, String programationLangage) {
		super();
		this.matricule = matricule;
		this.name = name;
		this.integrationDate = integrationDate;
		this.programationLanguage = programationLangage;
	}
	
	// Getters and Setters for fields
	public Integer getMatricule() {
		return matricule;
	}

	public void setMatricule(Integer matricule) {
		this.matricule = matricule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntegrationDate() {
		return integrationDate;
	}

	public void setIntegrationDate(String integrationDate) {
		this.integrationDate = integrationDate;
	}

	public String getProgramationLangage() {
		return programationLanguage;
	}

	public void setProgramationLangage(String programationLangage) {
		this.programationLanguage = programationLangage;
	}
	
	

}
