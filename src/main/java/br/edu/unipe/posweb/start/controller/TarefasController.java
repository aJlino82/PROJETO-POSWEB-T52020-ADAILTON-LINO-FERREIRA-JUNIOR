package br.edu.unipe.posweb.start.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unipe.posweb.model.Tarefas;
import br.edu.unipe.posweb.repository.TarefasRepository;

@RestController
@RequestMapping("/api")
public class TarefasController {

	@Autowired
	private TarefasRepository tarefasRepository;

	@PostMapping("/tarefas")
	public Tarefas save(@RequestBody @Valid Tarefas tarefas) {
		tarefas = tarefasRepository.save(tarefas);
		return tarefas;
	}

	@GetMapping("/tarefas")
	public List<Tarefas> getAll() {
		return tarefasRepository.findAll();
	}

}
