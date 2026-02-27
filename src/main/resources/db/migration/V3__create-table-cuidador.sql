CREATE TABLE cuidador (

    id BIGINT NOT NULL,
    certificacao VARCHAR(255),
    experiencia VARCHAR(500),
    disponivel BOOLEAN,
    valor_hora DECIMAL(10,2),

    PRIMARY KEY (id),

    CONSTRAINT fk_cuidador_pessoa
        FOREIGN KEY (id)
        REFERENCES pessoas(id)

);
