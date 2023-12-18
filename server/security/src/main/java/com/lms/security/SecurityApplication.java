package com.lms.security;

import com.lms.security.user.User;
import com.lms.security.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityApplication {

	@Autowired
	UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}



}
