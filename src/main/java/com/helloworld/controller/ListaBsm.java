package com.helloworld.controller;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/lista-bsm")

	public class ListaBsm {
			
			@GetMapping
			public String  helloworld() {
				return "Lista BMS :"
						+ "\nPersistência"
						+ "\nAtenção aos detalhes"
						+ "\nMentalidade crescimento"
						+ "\nTrabalho em Equipe"
						+ "\nResponsabilidade Pessoal"
						+ "\nProatividade"
						+ "\nOrientação ao Futuro"
						+ "\nComunicação";
			}
	}
