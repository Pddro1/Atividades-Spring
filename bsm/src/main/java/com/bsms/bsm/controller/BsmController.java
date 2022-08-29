package com.bsms.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {

	@GetMapping
	public String bsm() {
		return "Lista de BSM\n"
				+ "\nMentalidades"
				+ "\n1 - Orientação ao Futuro"
				+ "\n2 - Responsabilidade Pessoal"
				+ "\n3 - Mentalidade de Crescimento"
				+ "\n4 - Presistência\n"
				+ "\nHabilidades"
				+ "\n1 - Trabalho em Equipe"
				+ "\n2 - Atenção aos Detalhes"
				+ "\n3 - Proatividade"
				+ "\n4 - Comunicação";
	}
}
