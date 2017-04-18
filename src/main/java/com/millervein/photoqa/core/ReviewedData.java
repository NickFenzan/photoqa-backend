package com.millervein.photoqa.core;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ReviewedData {
	@Id @GeneratedValue
	private Integer id;
	private PatientInfo patient;
	private String reviewer;
	private LocalDate dateOfService;

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
}
