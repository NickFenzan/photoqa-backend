package com.millervein.photoqa.core;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

public interface ReviewedDataRepository extends JpaRepository<ReviewedData, Integer> {
	ReviewedData findFirstByDateOfServiceAndPatientPatientId(
			@Param("dateOfService") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateOfService,
			@Param("patientId") String patientId);
}
