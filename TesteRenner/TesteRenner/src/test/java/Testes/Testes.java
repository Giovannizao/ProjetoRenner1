package Testes;

import Drivers.Driver;
import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testes extends Driver {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	
	@Given("Dado que eu acessei o site {string}")
	public void dado_que_eu_acessei_o_site(String appUrl) {
	   metodos.abrirNavegador(appUrl, appUrl);
	   
		
	}

	

	@When("eu selecionar os tres produtos para o carrinho")
	public void eu_selecionar_os_tres_produtos_para_o_carrinho() {
		
		metodos.clicar(elementos.getClicarFora(), null);
		
		metodos.clicar(elementos.getProducts(), null);
		metodos.clicar(elementos.getClose(), null);
		metodos.escrever(elementos.getSearchProduct(), "Stylish Dress");
		metodos.clicar(elementos.getClicarPesquisar(), null);
		metodos.clicar(elementos.getFecharAnuncio(), null);
		metodos.clicar(elementos.getViewProduct(), null);
		metodos.clicar(elementos.getQuantity(), null);
		metodos.escrever(elementos.getQuantity(), "3");
		metodos.clicar(elementos.getAddtoCart(), null);
		metodos.clicar(elementos.getContinueShopping(), null);
		metodos.clicar(elementos.getProducts(), null);
		metodos.escrever(elementos.getSearchProduct(), "Beautiful Peacock Blue Cotton Linen Saree");
		metodos.clicar(elementos.getClicarPesquisar(), null);
		metodos.clicar(elementos.getFecharAnuncio(), null);
		metodos.clicar(elementos.getViewProduct(), null);
		metodos.clicar(elementos.getQuantity(), null);
		metodos.escrever(elementos.getQuantity(), "2");
		metodos.clicar(elementos.getAddtoCart(), null);
		metodos.clicar(elementos.getContinueShopping(), null);
		metodos.clicar(elementos.getProducts(), null);
		metodos.clicar(elementos.getClicarPesquisar(), null);
		metodos.escrever(elementos.getSearchProduct(), "Men Tshirt");
		metodos.clicar(elementos.getClicarPesquisar(), null);
		metodos.clicar(elementos.getFecharAnuncio(), null);
		metodos.clicar(elementos.getViewProduct(), null);
		metodos.clicar(elementos.getAddtoCart(), null);
		metodos.clicar(elementos.getContinueShopping(), null);
		metodos.clicar(elementos.getCart(), null);
		
	    
	}

	@Then("confirmo se todos os itens listados estao no carrinho")
	public void confirmo_se_todos_os_itens_listados_estao_no_carrinho() {
	    
		
	}

	
}
