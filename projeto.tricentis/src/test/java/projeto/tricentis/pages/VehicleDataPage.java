package projeto.tricentis.pages;

import org.openqa.selenium.By;

public class VehicleDataPage extends HomePage {

	public static String licence = "112022";

	public static By make = By.xpath("//*[@id='make']/option["+gerarNumAleatorio(16, 1)+"]");
	public static By enginePerformance = By.id("engineperformance");
	public static By dateOfManufacture = By.id("dateofmanufacture");
	public static By numberOfSeats = By.xpath("//*[@id='numberofseats']/option[" + gerarNumAleatorio(10, 1) + "]");
	public static By fuel = By.xpath("//*[@id='fuel']/option[" + gerarNumAleatorio(6, 1) + "]");
	public static By listPrice = By.id("listprice");
	public static By licensePlateNumber = By.id("licenseplatenumber");
	public static By annualMileage = By.id("annualmileage");
	public static By btnNextEnter = By.id("nextenterinsurantdata");

	public static void enterVehicleData() {
		clicar(make);
		escrever(enginePerformance, String.valueOf(gerarNumAleatorio(2000, 1)));
		escrever(dateOfManufacture, gerarDataAleatoria("qualquer"));
		clicar(numberOfSeats);
		clicar(fuel);
		escrever(listPrice, String.valueOf(gerarNumAleatorio(99501, 500)));
		escrever(licensePlateNumber, licence);
		escrever(annualMileage, String.valueOf(gerarNumAleatorio(99901, 100)));
		clicar(btnNextEnter);
	}

}
