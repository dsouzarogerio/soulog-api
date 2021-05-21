package com.meuprojeto.soulog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuprojeto.soulog.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("João Carlos");
		cliente1.setTelefone("(62)99123-4567");
		cliente1.setEmail("joaocarlos@meuprojeto.com.br");

		var cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Maria José");
		cliente2.setTelefone("(32)98945-4567");
		cliente2.setEmail("mariajoses@meuprojeto.com.br");

		return Arrays.asList(cliente1, cliente2);
	}
}
