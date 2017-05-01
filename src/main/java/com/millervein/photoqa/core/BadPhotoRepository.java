package com.millervein.photoqa.core;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BadPhotoRepository extends JpaRepository<BadPhoto, String> {
	
//	BadPhoto findFirstByDateOfService(@Param("dateOfService") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateOfService);
}
