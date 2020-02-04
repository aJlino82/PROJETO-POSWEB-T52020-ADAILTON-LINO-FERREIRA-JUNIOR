package br.edu.unipe.posweb.start.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unipe.posweb.model.Clientes;
import br.edu.unipe.posweb.repository.ClientesRepository;

@RestController
@RequestMapping("/api")
public class ClientesController {

	@Autowired
	private ClientesRepository clientesRepository;

	@PostMapping("/clientes")
	public Clientes save(@RequestBody @Valid Clientes clientes) {
		clientes = clientesRepository.save(clientes);
		return clientes;
	}

	@GetMapping("/clientes")
	public List<Clientes> getAll() {
		return clientesRepository.findAll();

	}

	@PutMapping("/clientes")
	public Clientes updateClientes(@RequestBody @Valid Clientes clientes) {
		if (clientes.getId() != null) {
			clientesRepository.save(clientes);
		}
		return clientes;
	}
}
