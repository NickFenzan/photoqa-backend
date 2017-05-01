package com.millervein.photoqa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = { PhotoqaApplication.class, Jsr310JpaConverters.class })
@SpringBootApplication
public class PhotoqaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PhotoqaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
