CREATE TABLE IF NOT EXISTS animal
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_provisorio  VARCHAR(255),
    idade_estimada   INT,
    raca             VARCHAR(255),
    data_entrada     DATE,
    data_adocao      DATE,
    condicao_chegada VARCHAR(255),
    nome_recebedor   VARCHAR(255),
    data_obito       DATE,
    porte            VARCHAR(255)
);

INSERT INTO animal (nome_provisorio, idade_estimada, raca, data_entrada, data_adocao, condicao_chegada, nome_recebedor,
                    data_obito, porte)
VALUES ('Bolt', 3, 'Labrador', '2024-02-20', NULL, 'Resgatado da rua', 'João Silva', NULL, 'Grande'),
       ('Mia', 2, 'Siamês', '2024-03-10', '2024-04-01', 'Entregue pelo dono', 'Ana Souza', NULL, 'Pequeno'),
       ('Thor', 5, 'Pastor Alemão', '2023-12-15', NULL, 'Abandonado', 'Carlos Oliveira', NULL, 'Grande'),
       ('Luna', 1, 'Poodle', '2024-01-05', '2024-02-10', 'Resgatado de maus-tratos', 'Mariana Costa', NULL, 'Médio'),
       ('Rex', 4, 'Golden Retriever', '2023-11-20', NULL, 'Resgatado após atropelamento', 'Fernanda Lima', NULL,
        'Grande'),
       ('Nina', 2, 'Vira-lata', '2024-02-01', '2024-02-20', 'Resgatado da rua', 'Ricardo Mendes', NULL, 'Pequeno'),
       ('Max', 3, 'Bulldog', '2023-10-10', NULL, 'Entregue pelo dono', 'Sandro Vieira', NULL, 'Médio'),
       ('Mel', 2, 'Beagle', '2023-09-25', '2023-12-15', 'Filhote abandonado', 'Patricia Ribeiro', NULL, 'Pequeno'),
       ('Toby', 6, 'Husky Siberiano', '2023-08-18', NULL, 'Resgatado de situação de risco', 'Daniel Ferreira', NULL,
        'Grande'),
       ('Lili', 3, 'Chihuahua', '2024-01-30', '2024-02-28', 'Entregue após falecimento do dono', 'Juliana Alves', NULL,
        'Pequeno');

// Gatos

CREATE TABLE IF NOT EXISTS animal_gato
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_provisorio  VARCHAR(255),
    idade_estimada   INT,
    raca             VARCHAR(255),
    data_entrada     DATE,
    data_adocao      DATE,
    condicao_chegada VARCHAR(255),
    nome_recebedor   VARCHAR(255),
    data_obito       DATE,
    porte            VARCHAR(255)
);

INSERT INTO animal_gato (nome_provisorio, idade_estimada, raca, data_entrada, data_adocao, condicao_chegada,
                         nome_recebedor, data_obito, porte)
VALUES ('Whiskers', 3, 'Persa', '2024-02-20', NULL, 'Resgatado da rua', 'João Silva', NULL, 'Pequeno'),
       ('Mia', 2, 'Siamês', '2024-03-10', '2024-04-01', 'Entregue pelo dono', 'Ana Souza', NULL, 'Pequeno'),
       ('Simba', 5, 'Maine Coon', '2023-12-15', NULL, 'Abandonado', 'Carlos Oliveira', NULL, 'Grande'),
       ('Luna', 1, 'Angorá', '2024-01-05', '2024-02-10', 'Resgatado de maus-tratos', 'Mariana Costa', NULL, 'Médio'),
       ('Felix', 4, 'Bombay', '2023-11-20', NULL, 'Resgatado após atropelamento', 'Fernanda Lima', NULL, 'Médio'),
       ('Nina', 2, 'Vira-lata', '2024-02-01', '2024-02-20', 'Resgatado da rua', 'Ricardo Mendes', NULL, 'Pequeno'),
       ('Garfield', 3, 'Exótico', '2023-10-10', NULL, 'Entregue pelo dono', 'Sandro Vieira', NULL, 'Médio'),
       ('Mel', 2, 'Bengal', '2023-09-25', '2023-12-15', 'Filhote abandonado', 'Patricia Ribeiro', NULL, 'Pequeno'),
       ('Tom', 6, 'Siberiano', '2023-08-18', NULL, 'Resgatado de situação de risco', 'Daniel Ferreira', NULL, 'Grande'),
       ('Lili', 3, 'Birmanês', '2024-01-30', '2024-02-28', 'Entregue após falecimento do dono', 'Juliana Alves', NULL,
        'Pequeno');
