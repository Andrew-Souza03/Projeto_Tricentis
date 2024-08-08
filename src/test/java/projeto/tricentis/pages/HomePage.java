package projeto.tricentis.pages;

import java.time.LocalDate;
import java.util.Random;

import org.openqa.selenium.By;

import projeto.tricentis.metodos.Metodos;

public class HomePage extends Metodos {
	
	public static Random random = new Random();

	
	public static By autoMobile = By.id("nav_automobile");

	
	public static void iniciandoCot() {
		clicar(autoMobile);
	}
	

	public static int gerarNumAleatorio(int n1, int n2) {
		int numAleatorio = random.nextInt(n1) + n2;
		if (numAleatorio == 1) {
			return numAleatorio + 1;
		} else {
			return numAleatorio;
		}
	}

	public static String gerarDataAleatoria(String tempo) {

		if (tempo == "qualquer") {
			int mes = gerarNumAleatorio(12, 1);
			int dia = gerarNumAleatorio(31, 1); // Dia entre 1 e 31
			int ano = random.nextInt(2005 - 1954 + 1) + 1954;

			String dataAleatoria = String.format("%02d/%02d/%4d", mes, dia, ano);
			return dataAleatoria;

		} else if (tempo == "futuro") {
			LocalDate dataAtual = LocalDate.now();

			LocalDate dataInicio = dataAtual.plusMonths(1);
			int diaAleatorio = random.nextInt(30);

			LocalDate dataAleatoria = dataInicio.plusDays(diaAleatorio);
			int mes = dataAleatoria.getMonthValue();
			int dia = dataAleatoria.getDayOfMonth();
			int ano = dataAleatoria.getYear();

			String dataFutura = String.format("%02d/%02d/%4d", mes, dia, ano);
			return dataFutura;
		}
		return null;
	}

	public static int escolhaAleatoria(int n1) {
		int escolha = random.nextInt(n1) + 1;

		return escolha;

	}
	
}
