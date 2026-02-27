CREATE TABLE cliente (

    id BIGINT NOT NULL,
    condicoes_medicas VARCHAR(500),
    contato_emergencia VARCHAR(100),

    PRIMARY KEY (id),

    CONSTRAINT fk_cliente_pessoa
        FOREIGN KEY (id)
        REFERENCES pessoas(id)

);
