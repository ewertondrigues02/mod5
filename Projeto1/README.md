# Projeto 1

CRUD em Java com validação de campos

## Descrição
Este é um projeto básico de CRUD (Create, Read, Update, Delete) desenvolvido em **Java** com a **JDK 21**, utilizando as IDEs **IntelliJ IDEA** e **NetBeans**. A interface gráfica foi construída com **Swing**, e o armazenamento dos dados foi implementado **em memória**, sem o uso de banco de dados.

O foco principal do projeto foi criar um sistema funcional com:
- **CRUD completo** para gerenciar dados.
- **Validação de campos** obrigatórios e de formato na interface gráfica.

## Funcionalidades
- Adicionar novos registros.
- Listar registros existentes.
- Atualizar registros.
- Excluir registros.
- Validação de campos (exemplo: verificar campos vazios, formatos de CPF, etc.).

## Tecnologias Utilizadas
- **Java JDK 21**
- **Swing** (para criação da interface gráfica)
- **IntelliJ IDEA** e **NetBeans** (ambiente de desenvolvimento)

## Estrutura do Projeto
- **src/**: Contém o código-fonte do projeto.
  - **model/**: Classes responsáveis por representar os dados.
  - **view/**: Interface gráfica feita com Swing.
  - **controller/**: Lógica de controle e validação.
- **README.md**: Este arquivo de documentação.

## Como Executar
1. Certifique-se de que o **JDK 21** está instalado no seu sistema.
2. Clone este repositório:
   ```bash
   git clone https://github.com/ewertondrigues02/projeto-1.git
   ```
3. Importe o projeto em sua IDE favorita (**IntelliJ IDEA** ou **NetBeans**).
4. Compile e execute o arquivo principal (**Main.java**).

## Exemplo de Tela
- **Tela de Cadastro**:
  - Valida campos obrigatórios como nome e CPF.
  - Exibe mensagens de erro em caso de preenchimento incorreto.

## Próximos Passos
- Implementar persistência de dados com banco de dados.
- Adicionar testes unitários para as validações e operações CRUD.
- Melhorar o design da interface gráfica.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença
Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

**Autor:** Ewerton Rodrigues  
**Local:** Guaramirim, Santa Catarina

