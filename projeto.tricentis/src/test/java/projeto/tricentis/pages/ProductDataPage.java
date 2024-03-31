package projeto.tricentis.pages;

import org.openqa.selenium.By;

public class ProductDataPage extends HomePage {

	public static int numCourtesy = escolhaAleatoria(3);

	public static By startDate = By.xpath("//*[@name='Start Date']");
	public static By insuranceSum = By.xpath("//*[@id='insurancesum']/option[" + gerarNumAleatorio(10, 1) + "]");
	public static By meritRating = By.xpath("//*[@id='meritrating']/option[" + gerarNumAleatorio(19, 1) + "]");
	public static By damageInsurance = By.xpath("//*[@id='damageinsurance']/option[" + gerarNumAleatorio(4, 1) + "]");
	public static By optionalProducts = By
			.xpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[" + escolhaAleatoria(2) + "]/span");
	public static By courtesyCar = By.xpath("//*[@id='courtesycar']/option[" + gerarNumAleatorio(3, 1) + "]");
	public static By btnNext = By.id("nextselectpriceoption");

	public static void enterProductData() {
		escrever(startDate, gerarDataAleatoria("futuro"));
		clicar(insuranceSum);
		clicar(meritRating);
		clicar(damageInsurance);
		clicar(optionalProducts);
		clicar(courtesyCar);
		clicar(btnNext);
	}
}
