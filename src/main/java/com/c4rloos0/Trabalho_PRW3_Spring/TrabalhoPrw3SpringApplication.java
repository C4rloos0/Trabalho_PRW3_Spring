package com.c4rloos0.Trabalho_PRW3_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class TrabalhoPrw3SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoPrw3SpringApplication.class, args);
	}

}
