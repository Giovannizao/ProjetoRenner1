package Runner;

import org.openqa.selenium.chrome.ChromeDriver;

import Drivers.Driver;

public class Executa extends Driver {
        
	
		
		public void abrirNavegador(String appUrl, String descricaoPasso)  {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(appUrl);
			driver.manage().window().maximize();
		}
	

	
}
