package br.edu.unipe.posweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unipe.posweb.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> findByNome(String nome);

}
