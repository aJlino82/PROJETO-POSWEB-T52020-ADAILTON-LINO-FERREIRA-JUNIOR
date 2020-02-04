package br.edu.unipe.posweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Vendas {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome", length = 24)
	private String nome;
	private Long notafiscal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getNotafiscal() {
		return notafiscal;
	}

	public void setNotafiscal(Long notafiscal) {
		this.notafiscal = notafiscal;
	}

}
