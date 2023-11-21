package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5McTarea3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5McTarea3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TAREA 3");
		System.out.println("Soy Michael Cevallos");
		System.out.println("Este es el cambio en la misma rama");
		System.out.println("Este es el cambio esta en otra rama de la misma tarea");
		
	}

}
