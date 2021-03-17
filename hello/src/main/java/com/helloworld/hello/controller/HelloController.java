package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		for(int c = 1; c <= 5; c++) {
			
		}
		return "Olá, mundo!\nmentalidade Karol, \npersistência, \ncomunicação Karol, \ntrabalho em equipe, \natenção aos detalhes.\n\n"
				+ "******************************\n"
				+ "* OBJETIVOS PARA ESSA SEMANA *\n"
				+ "******************************\n\n"
				+ "Aprender a usar e a aplicar o Spring Boot.";
	}
}
