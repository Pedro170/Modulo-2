CREATE DATABASE db_nome_minha_casa_mais_bonita;
CREATE TABLE tb_categoria(
id_categoria BIGINT NOT NULL AUTO_INCREMENT,
cama VARCHAR(30),
mesa VARCHAR(30),
banho VARCHAR(30),

PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_usuario(
id_usuario BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(30),
email VARCHAR(30),
telefone VARCHAR(15),
endereco VARCHAR(100)
-- PRIMARY KEY(id_usuario)

);

CREATE TABLE tb_produto(
id_produto BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(50),
cor VARCHAR(25),
tipo_de_material VARCHAR(50),
tamanho VARCHAR(10),
preco DECIMAL(5,2),
fk_id_categoria BIGINT,
PRIMARY KEY(id_produto)
);