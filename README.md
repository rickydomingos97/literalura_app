# LiterAlura - Catálogo de Livros

## Descrição
O LiterAlura é um catálogo de livros desenvolvido como parte de um desafio de programação proposto no Programa de formação de Devs da Oracle One em parceira com a Alura. Ele permite interação textual com os usuários através do console, oferecendo funcionalidades como cadastro de livros, busca por título, listagem de livros e autores, entre outras. O programa faz uso da API Gutendex para o consumo dos dados na aplicação.

## Funcionalidades da Aplicação:
- Cadastrar livro(s)
- Buscar livro pelo título
- Listar livros registrados
- Listar autores registrados
- Listar autores vivos em um determinado ano
- Listar livros em determinado idioma

  ## Ferramentas utilizadas no projeto:
- **PostgreSQL**
- **API Gutendex**
- **IntelliJ**
- **Spring Boot Initializr**
- **Jackson Databind**

## Requisitos para Executar a Aplicação

Para executar a aplicação LiterAlura, você precisará atender aos seguintes requisitos:

1. **Ambiente Java configurado**: Certifique-se de ter o ambiente Java configurado em seu sistema. Isso inclui ter o JDK (Java Development Kit) instalado e configurado corretamente. Nesse projeto foi utilizada a versão 22 do Java.

2. **Banco de dados PostgreSQL**: A aplicação utiliza o PostgreSQL como banco de dados. Portanto, é necessário ter um servidor PostgreSQL em execução e acessível à aplicação com a devida configuração necessaria para rodar a aplicação.

3. **Spring Boot**: O projeto é desenvolvido utilizando o framework Spring Boot. Certifique-se de ter as dependências do Spring Boot configuradas corretamente. As dependencias utilizadas no projeto foram JPA, DevTools, Postgres e Spring Web.

4. **Conexão com a internet**: A aplicação faz uso de uma API externa (Gutendex) para obter informações sobre livros. Portanto, é necessário ter uma conexão com a internet para que a aplicação possa fazer solicitações à API.

5. **Maven**: O Maven é utilizado para gerenciar as dependências do projeto. Certifique-se de ter o Maven instalado e configurado em seu sistema.

Além desses requisitos, é importante seguir as instruções de configuração e execução fornecidas no projeto, como configurar o banco de dados e as propriedades de conexão com a API Gutendex, conforme necessário.

Certifique-se de que todos os requisitos estão atendidos antes de executar a aplicação Literalura para garantir seu funcionamento adequado.

6 - Utilizei um arquivo .env para as variaveis de ambiente. Faz-se necessario o uso da dependencia: 'spring-dotenv' para que seja possivel utilizar o arquivo .env no projeto

## Contribuição e Sugestões
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias, correções de bugs ou novas funcionalidades são bem-vindas sempre! :blue_heart: :blue_heart:

##### Made with love :blue_heart:
