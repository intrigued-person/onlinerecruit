package com.shakeel.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobID;
	@Column
	private String role;
	@Column
	private String companyName;
	@Column
	private String eligibility;
	@Column
	private String companyNumber;

	@OneToMany(mappedBy = "job")
	private List<Application> application;

	public Job() {
		super();
	}

	public Job(int jobID, String role, String companyName, String eligibility, String companyNumber,
			List<Application> application) {
		super();
		this.jobID = jobID;
		this.role = role;
		this.companyName = companyName;
		this.eligibility = eligibility;
		this.companyNumber = companyNumber;
		this.application = application;

	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public List<Application> getApplication() {
		return application;
	}

	public void setApplication(List<Application> application) {
		this.application = application;
	}

}
