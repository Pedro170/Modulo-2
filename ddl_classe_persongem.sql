use db_generation_game_online;
drop table tb_classe;



CREATE TABLE tb_classe(
	id_classe BIGINT PRIMARY KEY AUTO_INCREMENT,
    classe VARCHAR(50),
    estilo_de_luta VARCHAR(50),
    poder_especial VARCHAR(50)
)DEFAULT CHARSET = utf8;

select * from tb_classe;
select * from tb_personagem;

CREATE TABLE tb_personagem(
	id_personagem BIGINT AUTO_INCREMENT,
    nome varchar(30),
	nacionalidade INT,
    forca_ataque INT,
    forca_defesa INT,
    descricao VARCHAR(30),
    fk_id_classe BIGINT,
    primary key (id_personagem),
   CONSTRAINT fk_tb_personagem_tb_classe FOREIGN KEY(fk_id_classe) REFERENCES db_generation_game_online.tb_classe(id_classe)
	)DEFAULT CHARSET = utf8;
    
    