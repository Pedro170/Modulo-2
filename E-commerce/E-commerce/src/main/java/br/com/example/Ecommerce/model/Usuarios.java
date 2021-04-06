package br.com.example.Ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuarios")
public class Usuarios {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
	private @NotNull @Size(min = 2, max = 45, message = "[ERRO] Ultrapassou o número de caractere permitido") String nome;
	private @NotNull @Size(min = 2, max = 45, message = "[ERRO] Ultrapassou o número de caractere permitido") String usuario;
	private @NotNull @Size(min = 2, max = 45, message = "[ERRO] Ultrapassou o número de caractere permitido") String senha;
	
	@OneToMany(mappedBy = "usuarios", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuarios")
	private List<Produto> produto;
	
	// ManyToMany
		@ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(
			name = "tb_inscricao",
			joinColumns = @JoinColumn(name = "usuario_id"),
			inverseJoinColumns = @JoinColumn(name = "produto_id"))
		@JsonIgnoreProperties("inscrito")
		private List<Loja> inscricao = new ArrayList<>();

	// Constructor
	public Usuarios() {
		
	}
	public Usuarios(Long id,
			@NotNull @Size(min = 2, max = 45, message = "[ERRO] Ultrapassou o número de caractere permitido") String nome,
			@NotNull @Size(min = 2, max = 45, message = "[ERRO] Ultrapassou o número de caractere permitido") String usuario,
			@NotNull @Size(min = 2, max = 45, message = "[ERRO] Ultrapassou o número de caractere permitido") String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	// Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	public List<Loja> getInscricao() {
		return inscricao;
	}
	public void setInscricao(List<Loja> inscricao) {
		this.inscricao = inscricao;
	}
}
