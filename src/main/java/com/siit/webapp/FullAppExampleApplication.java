package com.siit.webapp;

import jakarta.annotation.PostConstruct;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FullAppExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullAppExampleApplication.class, args);

	}



}
