package br.edu.unipe.posweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unipe.posweb.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}
