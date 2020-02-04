package br.edu.unipe.posweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unipe.posweb.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findProdutoByAnoFabricacao(int anoFabricacao);

}
