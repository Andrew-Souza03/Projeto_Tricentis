package projeto.tricentis.pages;

import org.openqa.selenium.By;

import projeto.tricentis.metodos.Metodos;

public class SendQuotePage extends Metodos{

	public static String emailEnviado = "andrew@souza.com";
	public static String usuario = "Admin123";
	public static String senha = "Aa1234";
	public static String comentario = "Cotação realizada e automatizada";
	
	public static By email = By.id("email");
	public static By phone = By.id("phone");
	public static By username = By.id("username");
	public static By password = By.id("password");
	public static By confirmPassword = By.id("confirmpassword");
	public static By comments = By.id("Comments");
	public static By btnSendEmail = By.id("sendemail");
	

	public static void sendQuote() {
		escrever(email, emailEnviado);
		escrever(phone, gerarTelefone());
		escrever(username, usuario);
		escrever(password, senha);
		escrever(confirmPassword, senha);
		escrever(comments, comentario);
		clicar(btnSendEmail);
	}
}
