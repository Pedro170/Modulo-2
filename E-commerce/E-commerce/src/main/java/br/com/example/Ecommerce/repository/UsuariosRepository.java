package br.com.example.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.example.Ecommerce.model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	public List<Usuarios> findAllByNomeContainingIgnoreCase(String nome);
}
