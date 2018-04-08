#language: pt
#Version: 1.0
#Encoding: iso-8859-1

Funcionalidade: Buscar elementos de perguntas frequentes, perguntas exibidas e valores da tela 

	Contexto: Realizacao do acesso inicial como pre-requisito
	
		Dado que estou na pagina inicial		
		
	@ID01 @ExecutaCenarios
	
	Cenario: Realizar ação de pesquisa de perguntas frequentes
	
		Quando acessar categoria de ajuda
	
		Entao apresenta resultado das perguntas frequentes e realiza print	
		
		
	@ID02 @ExecutaCenarios	
	
	Cenario: Realizar pesquisa "Institucional" na seção "Loja Física"

	
	 Quando acessar a opcao institucional na secao de loja fisica
	 
	 Entao validar as perguntas exibidas na tela
	 
	 @ID03 @ExecutaCenarios
	 
	Cenario: Realizar pesquisa do Telefone do Cartão C&A	
	 
	 Quando acessar opcao "Telefone do Cartão C&A"
	 
	 E salvar a imagem do cartao 
	 
	 Entao validar os telefones 
	 
	 
	 