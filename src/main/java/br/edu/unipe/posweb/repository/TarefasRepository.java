package br.edu.unipe.posweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unipe.posweb.model.Tarefas;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

	List<Tarefas> findTarefasByNome(String nome);
	

}