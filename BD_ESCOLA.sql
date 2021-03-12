#CREATE DATABASE db_escola
#DEFAULT CHARACTER SET utf8
#DEFAULT COLLATE utf8_general_ci;
#USE db_escola;
CREATE TABLE tb_alunos(
	id BIGINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(20) NOT NULL,
    sexo ENUM('M', 'F'),
    matricula INT NOT NULL,
    media DOUBLE,
    nascimento DATE,
    PRIMARY KEY(id)
)DEFAULT CHARSET = utf8;


SELECT * FROM tb_alunos;
INSERT INTO tb_alunos VALUES
('1', 'José Ricardo', 'M', '98777', '7.5', '2003-03-14'),
('2', 'Rita de Cássia', 'F', '98778', '8.5', '2003-12-18'),
('3', 'Flávio Hudson', 'M', '98779', '9.5', '2003-02-01'),
('4', 'Enzo Felipe', 'M', '98780', '10', '2003-05-05'),
('5', 'Valentina Vitoria', 'F', '98781', '10', '2004-10-09'),
('6', 'João Vitor', 'M', '98782', '6.5', '2003-02-20'),
('7', 'Ysmim', 'F', '98783', '7.5', '2003-007-05'),
('8', 'Bruno Carlo', 'M', '98784', '5.5', '2003-04-04');

SELECT * FROM tb_produto WHERE media > 7;
SELECT * FROM tb_produto WHERE valor < 7;

UPDATE tb_alunos SET matricula = 98785 WHERE id = '8';