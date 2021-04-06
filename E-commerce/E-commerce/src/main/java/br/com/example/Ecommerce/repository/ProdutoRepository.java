package br.com.example.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.example.Ecommerce.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByTituloProdutoContainingIgnoreCase(String TituloProduto);
}
