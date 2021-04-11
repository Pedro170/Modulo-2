SELECT * FROM db_nome_minha_casa_mais_bonita.tb_produto;

SELECT * FROM db_nome_minha_casa_mais_bonita.tb_produto WHERE preco > 50;
SELECT * FROM db_nome_minha_casa_mais_bonita.tb_produto WHERE preco BETWEEN  3 AND 60;
SELECT * FROM db_nome_minha_casa_mais_bonita.tb_produto WHERE nome LIKE 'B%';
SELECT AVG (preco) FROM db_nome_minha_casa_mais_bonita.tb_produto;
SELECT SUM(preco) FROM db_nome_minha_casa_mais_bonita.tb_produto;
SELECT SUM(id_produto) FROM db_nome_minha_casa_mais_bonita.tb_produto;