package com.mx.CrudCanciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.mx.Dao")
@EntityScan(basePackages = "com.mx.CrudCanciones.Dominio")
@ComponentScan(basePackages = "com.mx.CrudCanciones")
@SpringBootApplication
public class CancionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CancionesApplication.class, args);
	}

}
