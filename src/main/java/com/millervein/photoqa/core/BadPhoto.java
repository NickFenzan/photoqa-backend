package com.millervein.photoqa.core;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BadPhoto {
	@Id
	@GeneratedValue
	private Integer id;
	private PatientInfo patient;
	private String reviewer;
	private LocalDate dateOfService;
	private String photographer;
	private String legArea;
	private PhotoProblems problems;

	public Integer getId() {
		return id;
	}

	public PatientInfo getPatient() {
		return patient;
	}

	public String getReviewer() {
		return reviewer;
	}

	public LocalDate getDateOfService() {
		return dateOfService;
	}

	public String getPhotographer() {
		return photographer;
	}

	public String getLegArea() {
		return legArea;
	}

	public PhotoProblems getProblems() {
		return problems;
	}
}
