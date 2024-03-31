#language:pt
#Author: andrew.souza@hotmail.com

@regressivos
Funcionalidade: Cotacao
	Como usuario da aplicacao
	Quero informar os dados obrigatorios
	Para obter uma cotacao

  @positivo
  Cenário: Cotacao com sucesso
    Dado que esteja na home do site
    E abra o formulario
    E preencha todos os campos
    Então terei a cotacao com sucesso
    

