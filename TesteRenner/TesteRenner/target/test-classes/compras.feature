#giovanni.victor@hotmail.com


Feature: Eu como cliente cadastrado quero fazer a compra de ao menos tres produtos
  
  
  Scenario: Acessar o site de compras para efetuar as compras 
    Given Dado que eu acessei o site "https://automationexercise.com/"
    When eu selecionar os tres produtos para o carrinho 
    Then confirmo se todos os itens listados estao no carrinho
    
