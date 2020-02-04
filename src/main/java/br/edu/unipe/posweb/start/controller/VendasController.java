package br.edu.unipe.posweb.start.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unipe.posweb.model.Vendas;
import br.edu.unipe.posweb.repository.VendasRepository;

@RestController
@RequestMapping("/api")
public class VendasController {
	@Autowired
	private VendasRepository vendasRepository;

	@GetMapping("/vendas")
	public List<Vendas> getAll() {
		return vendasRepository.findAll();
	}

	@PostMapping("/vendas")
	public Vendas save(@RequestBody @Valid Vendas vendas) {
		vendas = vendasRepository.save(vendas);
		return vendas;
	}

}
