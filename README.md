
# Sistema de Gerenciamento de Carros, Clientes, Produtos e Vendas

Bem-vindo ao repositório do Sistema de Gerenciamento de Carros, Clientes, Produtos e Vendas! Este projeto foi desenvolvido em **Java** utilizando a **Java Persistence API (JPA)** para persistência de dados, com uma arquitetura baseada em **DAO (Data Access Object)** para simplificar operações de **CRUD (Create, Read, Update, Delete)**.

## 📁 Estrutura do Projeto

- **factory/**: Classes responsáveis pela criação de objetos relacionados ao sistema.
- **generic/**: Classes genéricas para operações comuns de acesso a dados.
- **dao/**: Interfaces e implementações para o acesso a dados das entidades.

### 🚀 Arquivos Principais

- **ClienteDAO.java**: Implementa operações de acesso a dados para a entidade `Cliente`.
- **IClienteDAO.java**: Interface que define métodos para `ClienteDAO`.
- **ProdutoDAO.java**: Implementa operações de acesso a dados para a entidade `Produto`.
- **IProdutoDAO.java**: Interface que define métodos para `ProdutoDAO`.
- **VendaDAO.java**: Implementa operações de acesso a dados para a entidade `Venda`.
- **IVendaDAO.java**: Interface que define métodos para `VendaDAO`.
- **Persistente.java**: Interface genérica que define métodos comuns para entidades persistentes.

## ✨ Funcionalidades

- **Gerenciamento de Clientes**: Adicionar, atualizar, listar e remover clientes.
- **Gerenciamento de Produtos**: Adicionar, atualizar, listar e remover produtos.
- **Gerenciamento de Vendas**: Criar, finalizar, listar e cancelar vendas, com suporte para associar produtos às vendas.
- **Relacionamentos**: Suporte a relacionamentos entre entidades, como um cliente podendo ter várias vendas.

## 🛠 Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **JPA**: Para mapeamento objeto-relacional.
- **SQL**: Para operações no banco de dados.

## ⚙️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/ewertondrigues02/tarefas-ebac.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd tarefas-ebac
   ```
3. Configure o banco de dados:
   - Atualize as configurações de conexão no arquivo `persistence.xml`.
4. Compile e execute o projeto:
   - Use sua IDE favorita (Eclipse, IntelliJ, etc.) ou uma ferramenta de construção como Maven ou Gradle.

## 🤝 Contribuição

Contribuições são bem-vindas! Para contribuir:
1. Crie um fork do repositório.
2. Crie uma nova branch:
   ```bash
   git checkout -b relacionamento entre tabelas
   ```
3. Faça suas alterações e commit:
   ```bash
   git commit -m "relacionamento"
   ```
4. Envie suas alterações:
   ```bash
   git push origin relacionamento
   ```
5. Abra um pull request no repositório original.

## 📜 Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.

---

Feito com ❤️ por [Ewerton Rodrigues](https://github.com/ewertondrigues02).


