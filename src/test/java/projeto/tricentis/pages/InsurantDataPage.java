package projeto.tricentis.pages;

import org.openqa.selenium.By;

public class InsurantDataPage extends HomePage{

	
	public static String name = "Andrew";
	public static String lName = "Souza";
	public static String address = "São paulo";
	public static String nameCity = "Barueri";
	public static String site = "andrew.com.br";

	public static By firstName = By.id("firstname");
	public static By lastName = By.id("lastname");
	public static By dateOfBirth = By.id("birthdate");
	public static By gender = By.xpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label["+escolhaAleatoria(2)+"]/span");
	public static By streetAddress = By.id("streetaddress");
	public static By country =  By.xpath("//*[@id='country']/option["+gerarNumAleatorio(51, 1)+"]");
	public static By zipCode = By.id("zipcode");
	public static By city = By.id("city");
	public static By occupation = By.xpath("//*[@id='occupation']/option["+gerarNumAleatorio(5, 1)+"]");
	public static By hobbies = By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label["+gerarNumAleatorio(5, 1)+"]");
	public static By website = By.id("website");
	public static By picture = By.xpath("//*[@id='picture']");
	public static By btnNext = By.id("nextenterproductdata");
	public static By btnPrev = By.id("preventervehicledata");

	
	public static void enterInsurantData() {
		escrever(firstName, name);
		escrever(lastName, lName);
		escrever(dateOfBirth, gerarDataAleatoria("qualquer"));
		clicar(gender);
		escrever(streetAddress, address);
		clicar(country);
		escrever(zipCode, String.valueOf(gerarNumAleatorio(100, 9999999)));
		escrever(city, nameCity);
		clicar(occupation);
		clicar(hobbies);
		escrever(website, site);
        clicar(btnNext);
	}
}

	
