# AmparaCare API

API backend desenvolvida com Java e Spring Boot para gerenciamento de clientes e cuidadores em uma plataforma de cuidados.

## 🚀 Tecnologias utilizadas

* Java 25
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL
* Flyway (Database Migration)
* Lombok
* Apache Maven
* Bean Validation (Jakarta Validation)

---

## 📁 Estrutura do projeto

O projeto segue uma arquitetura em camadas:

* **Controller** → responsável pelos endpoints da API
* **DTO** → responsável pela transferência de dados
* **Model (Entity)** → representa as entidades do banco de dados
* **Repository** → responsável pela comunicação com o banco
* **Migration** → responsável pela criação e versionamento das tabelas com Flyway

---

## 🧠 Arquitetura e boas práticas

O projeto foi desenvolvido seguindo boas práticas de desenvolvimento backend, incluindo:

- Arquitetura em camadas (Controller, DTO, Entity, Repository)
- Separação de responsabilidades (Separation of Concerns)
- Uso de DTOs para desacoplamento da camada de domínio
- Princípios SOLID
- Arquitetura inspirada em Domain-Driven Design (DDD)
- Modelagem de domínio com herança e entidades bem definidas
- Versionamento de banco com Flyway

Essa abordagem torna o sistema mais:

- Escalável
- Manutenível
- Testável
- Organizado

---

## 🧩 Entidades implementadas

O sistema utiliza herança com a entidade base `Pessoa`.

### Pessoa (classe base)

Contém os dados comuns:

* id
* nome
* genero
* cpf
* telefone
* email
* endereco

### Cliente

Herda de Pessoa e possui:

* condicoesMedicas
* contatoEmergencia

### Cuidador

Herda de Pessoa e possui:

* certificacao
* experiencia
* disponivel
* valorHora

### Endereco

Classe embutida contendo:

* logradouro
* bairro
* cep
* numero
* complemento
* cidade
* uf

---

## 📦 DTOs criados

### Cadastro

* DadosCadastroPessoa
* DadosCadastroCliente
* DadosCadastroCuidador
* DadosEndereco

### Listagem

* DadosListagemPessoa
* DadosListagemCliente
* DadosListagemCuidador

---

## 🌐 Endpoints implementados

### Cliente

**POST** `/clientes`
Cadastra um novo cliente

**GET** `/clientes`
Lista todos os clientes

---

### Cuidador

**POST** `/cuidadores`
Cadastra um novo cuidador

**GET** `/cuidadores`
Lista todos os cuidadores

---

## 🗄 Banco de dados

Banco utilizado:

* MySQL

Estratégia de herança utilizada:

```java
@Inheritance(strategy = InheritanceType.JOINED)
```

Tabelas criadas:

* pessoas
* cliente
* cuidador

---

## 🔄 Flyway Migration

O Flyway foi configurado para versionar e criar as tabelas automaticamente.

Migration criada:

```
db/migration/V1__create-table-pessoas.sql
db/migration/V1__create-table-clientes.sql
db/migration/V1__create-table-cuidadores.sql
```

Responsável por criar:

* tabela pessoas
* tabela clientes
* tabela cuidadores

---

## ▶️ Como executar o projeto

1. Criar banco MySQL:

```sql
CREATE DATABASE amparacare;
```

2. Configurar o application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/amparacare
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true
```
---

3. Executar o projeto

  Você tem duas formas de rodar o projeto:

1. **Usando a IDE**  
   Basta clicar no botão **Run/Play** da sua IDE (IntelliJ, Eclipse, VS Code, etc.).

2. **Usando o terminal**  
   Abra o terminal na pasta do projeto e execute:

   ```bash
   mvn spring-boot:run

---

## ✅ Funcionalidades implementadas

* Cadastro de cliente
* Listagem de clientes
* Cadastro de cuidador
* Listagem de cuidadores
* Herança entre entidades com JPA
* Uso de DTOs para transferência de dados
* Integração com MySQL
* Versionamento do banco com Flyway

---

## 👨‍💻 Autor

Desenvolvido como projeto de estudo utilizando boas práticas de desenvolvimento backend com Spring Boot.
