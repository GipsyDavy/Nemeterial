package com.gipsybuho.backend_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {
        "entity",
})

public class MiApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiApiRestApplication.class, args);
	}

}
