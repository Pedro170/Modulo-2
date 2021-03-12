#CREATE DATABASE db_ecommerce
#DEFAULT CHARACTER SET utf8
#DEFAULT COLLATE utf8_general_ci;
#USE db_ecommerce;
#CREATE TABLE tb_produto(
	#id BIGINT NOT NULL AUTO_INCREMENT,
	#nome VARCHAR(20) NOT NULL,
    #marca VARCHAR(20),
    #cor VARCHAR(15),
    #valor DOUBLE,
    #quantidade INT,
    #PRIMARY KEY(id)
#)DEFAULT CHARSET = utf8;

SELECT * FROM tb_produto;

INSERT INTO tb_produto VALUES
#('1', 'Televisão', 'LG', 'PRETA', 1200, '50'),
#('2', 'Celular', 'Samsung', 'Vermelho', 1800, '70'),
#('3', 'Notebook', 'Acer', 'Preto', 1899, '10'),
#('4', 'Tablet', 'Samsung', 'Branco', 1000, '100'),
#('5', 'Microondas', 'Philco', 'Branco', 489, '200'),
('6', 'Fogão', 'Brastemp', 'Branco', 859, '500'),
('7', 'Lava & Seca', 'Philco', 'Cinza', 2999, '250'),
('8', 'Celular', ' Moto G9', 'Rosa', 1899, '1500');

SELECT * FROM tb_produto WHERE valor > 500;
SELECT * FROM tb_produto WHERE valor < 500;

UPDATE tb_produto SET valor = 2400 WHERE id = '1';