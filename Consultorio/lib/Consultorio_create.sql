-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2015-11-05 23:03:08.048




-- tables
-- Table: atendimento_doenca
CREATE TABLE atendimento_doenca (
    atend_doen_if serial  NOT NULL,
    doenca_id_doenca integer  NOT NULL,
    atendimento_medico_id integer  NOT NULL,
    conduta varchar(500)  NULL,
    CONSTRAINT atendimento_doenca_pk PRIMARY KEY (atend_doen_if)
);



-- Table: atendimento_medico
CREATE TABLE atendimento_medico (
    id_atendimento_medico serial  NOT NULL,
    receituario_restrito_id integer  NOT NULL,
    atendimento varchar(700)  NOT NULL,
    procedimento_medico_id_procedimento_medico integer  NOT NULL,
    data_atendimento date  NOT NULL,
    valor_total money  NULL,
    planos_saude_id_plano integer  NOT NULL,
    pago boolean  NOT NULL,
	medico_id_integer  NOT NULL,
	pessoa_id integer  NOT NULL,
    reconsulta boolean  NULL,
	reconsulta_id integer NULL
    CONSTRAINT atendimento_medico_pk PRIMARY KEY (id_atendimento_medico)
);



-- Table: cidade
CREATE TABLE cidade (
    id_cidade serial  NOT NULL,
    nome varchar(45)  NOT NULL,
    cep varchar(45)  NULL,
    estado_id integer  NOT NULL,
    CONSTRAINT cidade_pk PRIMARY KEY (id_cidade)
);




-- Table: doenca
CREATE TABLE doenca (
    id_doenca serial  NOT NULL,
    nome varchar(100)  NOT NULL,
    cid varchar(45)  NULL,
    CONSTRAINT doenca_pk PRIMARY KEY (id_doenca)
);



-- Table: endereco
CREATE TABLE endereco (
    id_endereco serial  NOT NULL,
    logradouro varchar(45)  NOT NULL,
    numero varchar(45)  NOT NULL,
    complemento varchar(45)  NULL,
    bairro varchar(45)  NOT NULL,
    cep varchar(45)  NOT NULL,
    cidade_id integer  NOT NULL,
    CONSTRAINT endereco_pk PRIMARY KEY (id_endereco)
);



-- Table: estado
CREATE TABLE estado (
    id_estado serial  NOT NULL,
    nome varchar(60)  NOT NULL,
    sigla char(2)  NOT NULL,
    CONSTRAINT estado_pk PRIMARY KEY (id_estado)
);



-- Table: exames
CREATE TABLE exames (
    id_exame serial  NOT NULL,
    nome varchar(100)  NOT NULL,
    categoria varchar(100)  NOT NULL,
    observacao varchar(300)  NULL,
    atendimento_medico_id_atendimento_medico integer  NOT NULL,
    CONSTRAINT exames_pk PRIMARY KEY (id_exame,atendimento_medico_id_atendimento_medico)
);



-- Table: medicamento
CREATE TABLE medicamento (
    id_medicamento serial  NOT NULL,
    nome_popular varchar(70)  NOT NULL,
    principio_ativo varchar(100)  NOT NULL,
    nome_fantasia varchar(100)  NOT NULL,
    dosagem varchar(45)  NOT NULL,
    restrito boolean  NOT NULL,
    CONSTRAINT medicamento_pk PRIMARY KEY (id_medicamento)
);


-- Table: medico
CREATE TABLE medico (
    crm varchar(70)  NULL,
	id_medico integer  NOT NULL,
    CONSTRAINT medico_pk PRIMARY KEY (id_medico)
);


-- Table: pessoa
CREATE TABLE pessoa (
    id_pessoa serial  NOT NULL,
    nome varchar(100)  NOT NULL,
	data_nasc date NOT NULL,
	sexo varchar(9) NOT NULL,
	rg char(10)  NULL,
    cpf varchar(11)  NOT NULL,
    sus char(12)  NULL,
    nome_mae varchar(100)  NOT NULL,
	fone varchar(15) NOT NULL,
	fone2 varchar(15) NULL,
    endereco_id integer  NOT NULL,
	ativo boolean NOT NULL,
	medico boolean NOT NULL,
    CONSTRAINT pessoa_pk PRIMARY KEY (id_pessoa)
);


-- Table: receituario
CREATE TABLE receituario (
    id_receituario serial  NOT NULL,
    posologia varchar(200)  NOT NULL,
    medicamentos_id integer  NOT NULL,
    atendimento_medico_id_atendimento_medico integer  NOT NULL,
    atendimento_medico_id_medicos integer  NOT NULL,
    CONSTRAINT receituario_pk PRIMARY KEY (id_receituario)
);




-- foreign keys
-- Reference:  fk_atendimento_doenca_atendimento_medico1 (table: atendimento_doenca)


ALTER TABLE atendimento_doenca ADD CONSTRAINT fk_atendimento_doenca_atendimento_medico1 
    FOREIGN KEY (atendimento_medico_id)
    REFERENCES atendimento_medico (id_atendimento_medico)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  fk_atendimento_doenca_doenca1 (table: atendimento_doenca)


ALTER TABLE atendimento_doenca ADD CONSTRAINT fk_atendimento_doenca_doenca1 
    FOREIGN KEY (doenca_id_doenca)
    REFERENCES doenca (id_doenca)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  fk_atendimento_medico1 (table: atendimento_medico)


ALTER TABLE atendimento ADD CONSTRAINT fk_atendimento_medico1 
    FOREIGN KEY (medico_id)
    REFERENCES medico (id_medico)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  fk_atendimento_paciente1 (table: atendimento_medico)


ALTER TABLE atendimento ADD CONSTRAINT fk_atendimento_paciente1 
    FOREIGN KEY (pessoa_id)
    REFERENCES pessoa (id_pessoa)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;


-- Reference:  fk_cidade_estado (table: cidade)


ALTER TABLE cidade ADD CONSTRAINT fk_cidade_estado 
    FOREIGN KEY (estado_id)
    REFERENCES estado (id_estado)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;


-- Reference:  fk_endereco_cidade1 (table: endereco)


ALTER TABLE endereco ADD CONSTRAINT fk_endereco_cidade1 
    FOREIGN KEY (cidade_ID)
    REFERENCES cidade (id_cidade)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  fk_exames_atendimento_medico1 (table: exames)


ALTER TABLE exames ADD CONSTRAINT fk_exames_atendimento_medico1 
    FOREIGN KEY (atendimento_medico_id_atendimento_medico)
    REFERENCES atendimento_medico (id_atendimento_medico)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  fk_pessoa_endereco1 (table: pessoa)


ALTER TABLE pessoa ADD CONSTRAINT fk_pessoa_endereco1 
    FOREIGN KEY (endereco_id)
    REFERENCES endereco (id_endereco)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  fk_profissional_pessoa1 (table: medico)


ALTER TABLE medico ADD CONSTRAINT fk_medico_pessoa1 
    FOREIGN KEY (id_medico)
    REFERENCES pessoa (id_pessoa)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  fk_receituario_atendimento_medico1 (table: receituario)


ALTER TABLE receituario ADD CONSTRAINT fk_receituario_atendimento_medico1 
    FOREIGN KEY (atendimento_medico_id_atendimento_medico)
    REFERENCES atendimento_medico (id_atendimento_medico)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  fk_receituario_comum_medicamentos1 (table: receituario)


ALTER TABLE receituario ADD CONSTRAINT fk_receituario_comum_medicamentos1 
    FOREIGN KEY (medicamentos_id)
    REFERENCES medicamento (id_medicamento)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;


-- End Creates

INSERT INTO estado VALUES
	(default, 'Rio Grande do Sul', 'RS'),
	(default, 'São Paulo', 'SP'),
	(default, 'Tocantins', 'TO');
	
INSERT INTO cidade VALUES
	(default, 'Porto Alegre', '111111', 1),
	(default, 'Cid Tocantins', '222223', 3),
	(default, 'Sampa', '344223', 2),
	(default, 'Mato Leitão', '4323232', 1);
	
	







-- End of file.

