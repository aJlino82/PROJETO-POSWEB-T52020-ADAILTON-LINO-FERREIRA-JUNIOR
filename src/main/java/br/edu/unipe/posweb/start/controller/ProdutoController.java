package br.edu.unipe.posweb.start.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unipe.posweb.model.Produto;
import br.edu.unipe.posweb.repository.ProdutoRepository;

@RestController
@RequestMapping("/api")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping("/produto")
	public Produto save(@RequestBody @Valid Produto produto) {
		produto = produtoRepository.save(produto);
		return produto;
	}

	@GetMapping("/produto/{id}")
	public Produto getProdutoById(@PathVariable long id) {
		Produto produto = produtoRepository.findById(id).orElse(new Produto());
		return produto;
	}

	@GetMapping("/produto")
	public List<Produto> getAll() {
		return produtoRepository.findAll();
	}

	@PutMapping("/produto")
	public Produto updateProduto(@RequestBody @Valid Produto produto) {
		if (produto.getId() != null) {
			produtoRepository.save(produto);
		}
		return produto;
	}

	public String deleteById(Long id) {
		produtoRepository.deleteById(id);
		return "Enditade deletaid" + id;
	}

	@GetMapping("/produto/anofabricacao/{anofabricacao}")
	public List<Produto> getProduroByAno(@PathVariable int anoFabricacao) {
		return produtoRepository.findProdutoByAnoFabricacao(anoFabricacao);

	}

}
