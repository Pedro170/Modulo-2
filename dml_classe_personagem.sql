select * from tb_classe;
select * from tb_personagem;
INSERT INTO db_generation_game_online.tb_classe (classe, estilo_de_luta, poder_especial) VALUES
('lutador', 'selvagem', 'choque elétrico'),
('lutadora', 'artes marciais chinesas', 'hazanshu'),
('lutador', 'mistérios do yoga', 'distorcer e esticar membros'),
('lutador', 'sumo japonês', 'hyaku retsu harite'),
('lutador', 'artes assassinas', 'hadouken');

alter table tb_personagem modify column descricao varchar(300);

INSERT INTO db_generation_game_online.tb_personagem (nome, nacionalidade, forca_ataque, forca_defesa, descricao) VALUES
-- ('Blanka', 'Brazil', 1500, 2000, 'Ele se agacha e emite uma corrente elétrica chocando tudo o que toca.'),
('Chun-Li', 'China', '1300', '1500', 'Chun-Li foi projetada com um físico excepcionalmente forte porque ela foi a única mulher entre uma lista de poderosos personagens masculinos em Street Fighter II .'),
('Dhalsim', 'Índia', '2000', '2300', 'O mestre do Yoga pode contar com uma aparência macabra, mas suas intenções são as melhores. O pacifista só está lutando para proteger seu vilarejo, que se encontra ameaçado pelas forças de M. Bison'),
('Honda', 'Japão', '1800', '1000', 'Honda começou seu treinamento quando criança, exclusivamente focado em se tornar o maior lutador de sumô de todos os tempos.'),
('Ken', 'USA', '2000', '2500', 'O objetivo de Ken é testar seu poder contra muitos lutadores diferentes e se esforça para se tornar mais forte');

SELECT * FROM tb_personagem WHERE forca_ataque > 2000;
SELECT * FROM tb_personagem WHERE poder_defesa BETWEEN 1000 AND 2000;

SELECT nome FROM tb_personagem WHERE nome LIKE 'C%';
SELECT * FROM tb_classe WHERE estilo_de_luta = 'artes assassinas';

UPDATE tb_personagem SET fk_id_classe = '4' WHERE id_personagem = '4';

SELECT * FROM tb_personagem
	INNER JOIN tb_classe on tb_classe.id_classe  = tb_personagem.fk_id_classe;







