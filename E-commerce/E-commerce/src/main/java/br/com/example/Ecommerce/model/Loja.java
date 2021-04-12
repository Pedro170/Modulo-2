package br.com.example.Ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_loja")
public class Loja {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
	private @NotNull @Size(min = 2, max = 45, message = "[ERRO] Ultrapassou o número de caractere permitido!") String nomeLoja;
	private @Size(min = 30, max = 100, message = "[ERRO] Ultrapassou o número de caractere permitido!") String descricao;
	
	// OneToMany
	@OneToMany(mappedBy = "loja", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("loja")
	private List<Produto> produto;
	
	@ManyToMany(mappedBy = "inscricao", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("produto")
	private List<Usuarios> inscrito = new ArrayList<>();
	
	// Constructor
	public Loja() {

	}
	public Loja(Long id,
			@NotNull @Size(min = 2, max = 45, message = "[ERRO] Ultrapassou o número de caractere permitido!") String nomeLoja,
			@Size(min = 30, max = 100, message = "[ERRO] Ultrapassou o número de caractere permitido!") String descricao) {
		super();
		this.id = id;
		this.nomeLoja = nomeLoja;
		this.descricao = descricao;
	}
	
	// Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	public List<Usuarios> getInscrito() {
		return inscrito;
	}
	public void setInscrito(List<Usuarios> inscrito) {
		this.inscrito = inscrito;
	}
}
