package com.millervein.photoqa.core;

import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class PatientInfo {
	private String patientId;
	private String firstName;
	private String lastName;
	private LocalDate dob;

	public String getPatientId() {
		return patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getDob() {
		return dob;
	}
}
