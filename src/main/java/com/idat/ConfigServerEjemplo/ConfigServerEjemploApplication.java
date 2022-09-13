package com.idat.ConfigServerEjemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerEjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerEjemploApplication.class, args);
	}

}
