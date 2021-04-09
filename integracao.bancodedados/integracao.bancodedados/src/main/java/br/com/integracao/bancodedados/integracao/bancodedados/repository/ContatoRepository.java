package br.com.integracao.bancodedados.integracao.bancodedados.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.integracao.bancodedados.integracao.bancodedados.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

	/*
	 *public Contato findFirsByNome(String nome);
	 *public List<Contato> findAllByNomeContainingIgnoreCase(String nome);
	 */
}
