package br.com.integracao.bancodedados.integracao.bancodedados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tb_contato")
public class Contato {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
	private @NotEmpty(message = "O DDD deve ser preenchido") String ddd;
	private @NotEmpty(message = "O telefone deve ser preenchido") String telefone;
	private @NotEmpty(message = "O Nome deve ser preenchido") String nome;
	
	// Constructors
	public Contato() {
		
	}
	public Contato(Long id, @NotEmpty(message = "O DDD deve ser preenchido") String ddd,
			@NotEmpty(message = "O telefone deve ser preenchido") String telefone,
			@NotEmpty(message = "O Nome deve ser preenchido") String nome) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.telefone = telefone;
		this.nome = nome;
	}
	
	// Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
