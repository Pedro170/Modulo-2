SELECT * FROM tb_pizza;
SELECT * FROM tb_categoria;
INSERT INTO tb_categoria(doce, salgada, adicionais) VALUES
('Borda tradicional', 'Borda recheada','granulado'),
('Massa fina', 'Massa grossa','dobro do recheio'),
('Borda tradicional', 'Borda recheada','bacon'),
('Massa fina', 'Massa grossa','queijo'),
('Meio a Meio', 'Três sabores','Frutas');

INSERT INTO tb_pizza(nome, tamanho, sabor, categoria,preco) VALUES
('Portuguesa','Médio','Muçarela/Ovos/Presunto/Palmito','Tradicional', 47.00),
('Roma','Pequena','Muçarela/Ovos/Presunto','Promoção', 30.00),
('Calabresa','Grande','Calabresa/Cebola/Muçarela','Promoção', 33.00),
('Pepperoni','Médio','Muçarela/Pepperoni/Azeite/Manjericão','Especiais', 57.00);

