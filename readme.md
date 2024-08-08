# Automação de Testes para a Funcionalidade de Cotação de Automóveis

Este é um projeto de automação de testes para a funcionalidade de cotação de automóveis do site [Sample App Tricentis](https://sampleapp.tricentis.com/).

## Objetivo

O objetivo deste projeto é demonstrar a automação de testes para a funcionalidade de cotação de automóveis do site Tricentis, utilizando o padrão Page Object para manter o código organizado e reutilizável.

## Ferramentas Utilizadas

- Selenium WebDriver: para automatizar a interação com o navegador web.
- JUnit: como framework de teste para estruturar e executar os testes.
- Java: linguagem de programação para escrever os scripts de automação.

## Configuração do Ambiente

Para executar os testes, você precisa ter o seguinte ambiente configurado:

1. JDK (Java Development Kit) instalado na máquina.
2. Maven configurado para gerenciar as dependências do projeto.
3. WebDriver adequado para o navegador que deseja automatizar (por exemplo, ChromeDriver para o Google Chrome).

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **src/main/java**: Contém as classes principais do projeto, incluindo as classes Page Object e métodos de apoio.
- **src/test/java**: Contém os testes automatizados.
- **src/test/resources**: Pode conter arquivos de configuração, como propriedades ou arquivos de dados de teste.
- **pom.xml**: Arquivo POM (Project Object Model) do Maven que especifica as dependências do projeto e outras configurações.

## Executando os Testes

1. Clone este repositório em sua máquina local.
2. Certifique-se de ter configurado o ambiente conforme descrito acima.
3. Navegue até a raiz do projeto e execute o seguinte comando no terminal: mvn test -Dtest=Executa

