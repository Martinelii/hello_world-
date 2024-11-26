package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm(){
		return "Mentalidades:\n"
				+ "Orientação ao futuro\n"
				+ "Responsabilidade Pessoal\n"
				+ "Mentalidade de crescimento\n"
				+ "Persistência\n"
				+ "Habilidade:\n"
				+ "Trabalho em equipe\n"
				+ "Atenção aos detalhes\n"
				+ "Proatividade\n"
				+ "Comunicação";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Revisar API REST\nFazer Exercicios\nComecar planeja projeto";
	}
}
