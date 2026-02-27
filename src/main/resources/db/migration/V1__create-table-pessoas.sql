CREATE TABLE pessoas (

    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    genero VARCHAR(50) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,

    logradouro VARCHAR(255),
    bairro VARCHAR(100),
    cep VARCHAR(8),
    numero VARCHAR(20),
    complemento VARCHAR(255),
    cidade VARCHAR(100),
    uf VARCHAR(2),

    PRIMARY KEY (id)

);