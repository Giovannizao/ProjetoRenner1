package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elementos {
	
	public static WebDriver driver;
	
	
	// Products
	
	private By products = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
	private By close = By.xpath("/html/body");
	private By searchProduct = By.xpath("//*[@id=\"search_product\"]");
	private By clicarPesquisar = By.xpath("//*[@id=\"submit_search\"]");
	private By viewProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
	private By quantity = By.xpath("//*[@id=\"quantity\"]");
	private By addtoCart = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
	private By continueShopping = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	private By cart = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
	
	// fechar anuncios 
	
	private By fecharAnuncio = By.xpath("//*[@id=\"aswift_4_host\"]"); 
	private By clicarFora = By.xpath("//*[@id=\"header\"]/div");
	
	
	//Metodos Publicos 
	
	public By getProducts() {
		return products;
	}
	
	public By getClose() {
		return close;
	}


	public By getSearchProduct() {
		return searchProduct;
	}



	public By getClicarPesquisar() {
		return clicarPesquisar;
	}



	public By getViewProduct() {
		return viewProduct;
	}



	public By getQuantity() {
		return quantity;
	}

	public By getAddtoCart() {
		return addtoCart;
	}

	public By getContinueShopping() {
		return continueShopping;
	}

	public By getCart() {
		return cart;
	}

	public By getFecharAnuncio() {
		return fecharAnuncio;
	}

	public By getClicarFora() {
		return clicarFora;
	}



	

}
	