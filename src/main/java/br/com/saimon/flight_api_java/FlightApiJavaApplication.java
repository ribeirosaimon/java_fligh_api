package br.com.saimon.flight_api_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
		(exclude = SecurityAutoConfiguration.class)
public class FlightApiJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightApiJavaApplication.class, args);
	}

}
