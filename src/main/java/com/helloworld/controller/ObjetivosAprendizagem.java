package com.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")

public class ObjetivosAprendizagem {
	@GetMapping
	public String  helloworld() {
		return "Aprender Fundamentos do Spring Boot";
	}
}
