package com.local.spring_docker_db_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
public class SpringDockerDbAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDbAppApplication.class, args);
	}

}
