package com.mosi.ppmtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class PpmtoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpmtoolApplication.class, args);
	}

	@GetMapping(name = "/")
	public String getName(){
		return "Hello Project Mangement Tool";
	}

}
