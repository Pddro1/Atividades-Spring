package com.aprendizagem.aprendizagemsem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista")
public class ListaController {

	@GetMapping
	public String lista() {
		return "Lista de Aprendizagem\n"
				+ "\n1 - Estudar e Praticar o Spring\n"
				+ "\n2 - Estudar Banco de Dados\n"
				+ "\n3 - Entregar as Atividades no dia\n";
	}
}
