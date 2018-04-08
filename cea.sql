#Todos dados com CD 10020
SELECT * FROM ITEM
WHERE CD = 10020

#Selecionar todos itens únicos na tabela
SELECT * FROM ITEM
WHERE ITEM = 'BLUSA'

#Retornar endereço da loja com nome IBI
SELECT ENDERECO FROM LOJA
WHERE NOME = 'IBI'

#Busca de todas as lojas em ordem crescente
SELECT * FROM LOJA 
WHERE NUM_LOJA > 0 
ORDER BY NUM_LOJA ASC