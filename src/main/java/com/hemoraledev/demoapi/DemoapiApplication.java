package com.hemoraledev.demoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@ComponentScan("com.hemoraledev.demoapi")
public class DemoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoapiApplication.class, args);
	}

}
