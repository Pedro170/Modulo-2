package br.com.example.Ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	
	@NotNull
	@Size(min = 2, max = 45, message = "[ERRO] Sua mensagem ultrapassou o número de caractere permitido")
	private String tituloProduto;
	
	@NotNull
	@Column(name="valor", columnDefinition="Decimal(5,2)")
	private Float valor;
	
	@Size(min = 2, max = 200)
	private String urlImagem;
	
	// ManyToOne
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Loja loja;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuarios usuarios;
	

	// Constructor
	public Produto() {
		
	}

	public Produto(Long id_produto,
			@NotNull @Size(min = 2, max = 45, message = "[ERRO] Sua mensagem ultrapassou o número de caractere permitido") String tituloProduto,
			@NotNull Float valor) {
		super();
		this.id_produto = id_produto;
		this.tituloProduto = tituloProduto;
		this.valor = valor;
	}
	
	// Getters and Setters
	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getTituloProduto() {
		return tituloProduto;
	}

	public void setTituloProduto(String tituloProduto) {
		this.tituloProduto = tituloProduto;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
}
