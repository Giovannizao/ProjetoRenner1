package Metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Drivers.Driver;

public class Metodos extends Driver {
	

	//@BeforeClass
	public void abrirNavegador(String appUrl, String descricaoPasso)  {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	public void clicar(By elemento, String texto) {
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
		
	}
	
	public void validarTexto(String textoEsperado, By elemento) {
		
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
			}

}

	

