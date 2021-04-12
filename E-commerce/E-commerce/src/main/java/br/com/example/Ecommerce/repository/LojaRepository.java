package br.com.example.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.example.Ecommerce.model.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long> {
	public List<Loja> findAllByDescricaoContainingIgnoreCase(String descricao);
	public List<Loja> findAllByNomeLojaContainingIgnoreCase(String NomeLoja);
}
