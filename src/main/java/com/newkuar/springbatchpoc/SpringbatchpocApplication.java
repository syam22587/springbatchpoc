package com.newkuar.springbatchpoc;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringbatchpocApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbatchpocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
