package br.edu.unipe.posweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unipe.posweb.model.Vendas;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long> {
	List<Vendas> findByNome(String nome);
	
}
