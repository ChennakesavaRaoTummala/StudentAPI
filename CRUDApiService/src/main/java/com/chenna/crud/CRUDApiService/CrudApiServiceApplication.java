package com.chenna.crud.CRUDApiService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class })
public class CrudApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApiServiceApplication.class, args);
	}

}
