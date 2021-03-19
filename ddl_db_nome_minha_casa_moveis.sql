CREATE DATABASE db_nome_minha_casa_mais_bonita
DEFAULT CHARACTER SET uft8
DEFAULT COLLATE utf8_general_ci;
USE db_nome_minha_casa_mais_bonita;
------------------------------------------------
-- tb_produto
------------------------------------------------
CREATE TABLE tb_produto (
	id_produto BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45),
    cor VARCHAR(30),
    tamanho VARCHAR(12),
    tipo_material VARCHAR(20),
    preco DECIMAL(5,2),
    PRIMARY KEY (id_produto),
	fk_tb_categoria BIGINT,
	CONSTRAINT fk_tb_produtos FOREIGN KEY(fk_tb_categoria) REFERENCES db_nome_minha_casa_mais_bonita.tb_categoria(id_categoria)
)DEFAULT CHARSET utf8;
--------------------------------------------------
-- tb_categoria
--------------------------------------------------
CREATE TABLE tb_categoria (
	id_categoria BIGINT NOT NULL AUTO_INCREMENT,
	cama VARCHAR(45),
    mesa VARCHAR(45),
    banho VARCHAR(45),
    PRIMARY KEY (id_categoria)
)DEFAULT CHARSET utf8;
--------------------------------------------------
-- tb_usuario
--------------------------------------------------
CREATE TABLE tb_usuario (
	id_usuario BIGINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(30),
    email VARCHAR(30),
    endereco VARCHAR(50),
    dia_compra DATETIME,
    PRIMARY KEY (id_usuario)
)DEFAULT CHARSET utf8;