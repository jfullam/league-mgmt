package org.jfullam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class PersonServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(PersonServiceApplication.class, args);

	}
}
