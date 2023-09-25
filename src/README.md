# Projeto de Gestão Acadêmica com Spring

Este é um projeto de gestão acadêmica desenvolvido com Spring, que permite cadastrar alunos e oferece funcionalidades de login. O projeto utiliza as seguintes dependências:

- Spring Web
- Thymeleaf
- Spring Boot Dev Tools
- Spring Data JPA
- H2 Database
- Java 11

## Pré-requisitos

Certifique-se de que você tenha o Java 11 instalado em sua máquina antes de executar o projeto. Além disso, o Maven é usado para gerenciar as dependências do projeto, então você deve tê-lo instalado também.

## Configuração

1. Clone este repositório para sua máquina local:<br>
    git clone https://github.com/seu-usuario/nome-do-repositorio.git

2. Navegue até o diretório do projeto:<br>
    cd nome-do-repositorio

3. Execute o projeto usando o Maven:<br>
    ./mvnw spring-boot:run

## Acesso ao Banco de Dados

Este projeto utiliza o banco de dados H2 Database para armazenar os dados. Você pode acessar o console do H2 Database em [http://localhost:8080/h2-console](http://localhost:8080/h2-console) após iniciar o aplicativo. As configurações padrão do banco de dados estão definidas no arquivo `application.properties`.

## Uso

Após iniciar o aplicativo, você pode acessar a interface web em [http://localhost:8080](http://localhost:8080) para realizar as seguintes ações:

### Cadastro de Alunos

Você pode cadastrar alunos fornecendo as informações necessárias na página de cadastro.

## Desenvolvimento

Este projeto segue o padrão de desenvolvimento MVC (Model-View-Controller), onde:

- O modelo (Model) representa os objetos de domínio, como Aluno.
- A visualização (View) é implementada usando Thymeleaf para as páginas HTML.
- O controle (Controller) é responsável por gerenciar as solicitações HTTP e int
