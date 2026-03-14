CREATE TABLE atendimentos (

    id BIGINT NOT NULL,
    cliente_id BIGINT NOT NULL,
    cuidador_id BIGINT NOT NULL,
    data DATE NOT NULL,
    hora TIME NOT NULL,
    status VARCHAR(50),
    observacao VARCHAR(255),
    valor DECIMAL(10,2),
    PRIMARY KEY (id),

    CONSTRAINT fk_atendimento_cliente
        FOREIGN KEY (cliente_id)
        REFERENCES clientes(id),

    CONSTRAINT fk_atendimento_cuidador
        FOREIGN KEY (cuidador_id)
        REFERENCES cuidadores(id)

);