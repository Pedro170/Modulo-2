CREATE DATABASE db_pizzaria_legal
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

use db_pizzaria_legal;
CREATE TABLE tb_categoria(
id_categoria BIGINT NOT NULL AUTO_INCREMENT,
doce VARCHAR(40),
salgada VARCHAR(40),
adicionais VARCHAR(40),
PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_pizza(
id_pizza BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(50),
tamanho VARCHAR(50),
sabor VARCHAR(50),
categoria VARCHAR(30),
preco DOUBLE,
PRIMARY KEY(id_pizza),
fk_id_categoria BIGINT,
CONSTRAINT fk_tb_pizza FOREIGN KEY(fk_id_categoria) REFERENCES db_pizzaria_legal.tb_categoria(id_categoria)
);

SELECT * FROM tb_pizza;
SELECT * FROM tb_categoria;
ALTER TABLE tb_categoria MODIFY column adicionais VARCHAR(50); 