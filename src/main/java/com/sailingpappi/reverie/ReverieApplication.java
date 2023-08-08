package com.sailingpappi.reverie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReverieApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverieApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (String[] args) {
		return runner -> {System.out.println("WHAT THE HELL!");};
	}

}
