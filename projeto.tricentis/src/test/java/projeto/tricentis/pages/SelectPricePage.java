package projeto.tricentis.pages;

import org.openqa.selenium.By;


public class SelectPricePage extends HomePage{

	
	public static By selectPriceOptions = By.xpath("//*[@id='priceTable']/tfoot/tr/th[2]/label["+escolhaAleatoria(4)+"]");
	public static By btnSendQuote = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]");
	
	public static void selectPrice() {
		 clicar(selectPriceOptions);
		try {
	            Thread.sleep(1000);
	            clicar(btnSendQuote);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
}
