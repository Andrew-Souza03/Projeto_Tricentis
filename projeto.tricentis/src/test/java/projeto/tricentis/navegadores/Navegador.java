package projeto.tricentis.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import projeto.tricentis.drivers.Drivers;

public class Navegador extends Drivers{

	public static void abrirNavegador() {

		driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();

	}

	public static void fecharNavegador() {
		driver.quit();
	}
	
	
}
