package projeto.tricentis.metodos;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import projeto.tricentis.drivers.Drivers;
import projeto.tricentis.elementos.Elementos;

public class Metodos extends Drivers {


	Elementos el = new Elementos();

	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public static void clicar(By elemento) {
		
		driver.findElement(elemento).click();
	}

	public static void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public static void rolarTela() {
		 JavascriptExecutor js = (JavascriptExecutor) driver; 
	        // Rolar a tela para baixo
	     js.executeScript("window.scrollBy(0, 500);"); // Altere o valor de 500 conforme necessário       
	}


public static String gerarTelefone() {
    Random random = new Random();

    int codigoArea = random.nextInt(900) + 100; // Entre 100 e 999
    int parteNumerica = random.nextInt(9000000) + 1000000; // Entre 1000000 e 9999999

    // Formata o número de telefone
    String numeroTelefone = String.format("%03d%07d", codigoArea, parteNumerica);

    return numeroTelefone;
}

public static void validarCotacao(By elemento, String msgRecebida) {
	 try {
         Thread.sleep(10000);
         String msgEsperada = driver.findElement(elemento).getText();
     	assertEquals(msgRecebida, msgEsperada);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
	
}

}
