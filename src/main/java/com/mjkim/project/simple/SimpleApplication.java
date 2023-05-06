package com.mjkim.project.simple;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApplication {

	public static void main(String[] args) {
		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
		final LocalDateTime now = LocalDateTime.now();
		
		System.out.println("Hello, World! The current time is " + dtf.format(now));

		SpringApplication.run(SimpleApplication.class, args);
	}

}
